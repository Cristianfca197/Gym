package gym

class UserController {

    static scaffold = User

    def index() { }

    def createUser(){
        User user = new User(
            name: params.name
        ).save()
    }
}
