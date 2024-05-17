package gym

class LoginController {

    def userService

    def index() { }

    def loginView(){}

    def login(){
        User user = userService.login(params.name)
        if(user){
            redirect(controller: "User", action: "main", id: user.id)
        }else{
            render "Usuario no encontrado"
        }
    }
}
