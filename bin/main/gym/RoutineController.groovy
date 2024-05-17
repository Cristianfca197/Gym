package gym

class RoutineController {

    def index() { }

    def createRoutine(){
        User user = User.get(params.id)
        [
                user: user
        ]
    }
}
