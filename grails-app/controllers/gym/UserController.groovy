package gym

class UserController {

    def userService
    def exerciseUserService

    //static scaffold = User

    def index(Long id) {
        User user = User.get(id)
        if(user){
            [user: user]
        }else{
            render("Error")
        }
        //render "Prueba de render"
        //redirect(action: createUser())
    }

    def createUser(){
        User user = new User(
            name: params.name
        ).save(failOnError: true)
        render "Registrandome ${user}"
    }

    def listUser() {
        def users = User.list()
        [users: users] //esto se envia a la vista
    }

    def exerciseList(){
        User user = User.get(params.id)
        List exercisesUser = ExerciseUser.findAllByUser(user)
        [
                user: user,
                exercises: exercisesUser
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
