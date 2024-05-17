package gym

class UserController {

    def userService
    def exerciseUserService

    //static scaffold = User
    static allowedMethods = [
            'index': 'GET',
            'createUser': 'POST'
    ]
    def index(){}

    def main() {
        User user = User.get(params.id)
        List exercisesList = ExerciseList.findAllByUser(user)
        List exercises = Exercise.findAll()
        if(user){
            [
                    user: user,
                    exerciseLists: exercisesList,
                    exercises: exercises
            ]
        }else{
            redirect(action: createUser())
            //render("Error")
        }
        //render "Prueba de render"
        //redirect(action: createUser())
    }

    def createUserView(){}

    def createUser(){
        User user = new User(
            name: params.name
        ).save(failOnError: true)
        redirect(action: index())
    }

    def listUser() {
        def users = User.list()
        [users: users] //esto se envia a la vista
    }

    def exerciseList(){
        User user = User.get(params.id)
        List exercisesList = ExerciseList.findAllByUser(user)
        [
                user: user,
                exerciseLists: exercisesList
        ]
    }

    def createList(){
        def selectedExercisesId = params.list('selectedExercises')
        ExerciseList exerciseList = userService.createExerciseList(params.userId as long, params.name)
        userService.addExercisesInList(exerciseList.id, selectedExercisesId)

        redirect(controller: "User", action: "index", id: params.userId)
    }

    def addExercise(){
        def exerWeight = Weight.list()
        def exerCardio = Cardio.list()
        def user = User.get(params.id)
        [
                user: user,
                exerWeight: exerWeight,
                exerCardio: exerCardio
        ]
    }

    def addSelectedExercises(){
        def selectedExercisesId = params.list('selectedExercises')
        for(id in selectedExercisesId){
            ExerciseUser exerciseUser = userService.addExercise(params.id as long, id as long)
        }
        redirect(controller: "User", action: "index", id: params.id)
    }

    def routineList(){

    }

    def programList(){

    }
}
