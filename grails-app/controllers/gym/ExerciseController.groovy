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

    def createCardio(){}
}
