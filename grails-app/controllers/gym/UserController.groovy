package gym

class UserController {

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
        [
                user: user,
                exercises: user.getExercises()
        ]
    }

    def addSelectedExercises(){
        def selectedExercisesId = params.list('selectedExercises')
        User user = User.get(params.id)
        for(id in selectedExercisesId){
            Exercise exercise = Exercise.get(id as Long)
            user.addExercise(exercise)
            user.save()
        }
        redirect(controller: "User", action: "index", id: user.id)
    }

    def routineList(){

    }

    def programList(){

    }
}
