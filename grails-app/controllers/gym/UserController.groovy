package gym

class UserController {

    static scaffold = User

    def index() {
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
}
