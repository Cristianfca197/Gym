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
}
