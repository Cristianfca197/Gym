package gym

class LoginController {

    def userService

    def index() { }

    def login(){
        User user = userService.login(params.name)
        if(user){
            redirect(controller: "User", action: "index", id: user.id)
        }else{
            render "Usuario no encontrado"
        }
    }
}
