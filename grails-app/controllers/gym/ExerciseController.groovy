package gym

class ExerciseController {

    def index() { }

    def formWeight(){}

    def createWeight(){
        Weight exercise = new Weight(
                name: params.name
        ).save(failOnError: true)
        render "Cargando ${exercise.getName()}"
    }

    def createCardio(){

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
}
