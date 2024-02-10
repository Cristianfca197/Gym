package gym

class ExerciseController {

    static scaffold = Exercise

    def index() { }

    def create(){
        render(view: 'createExercise')
    }

    def save(){
        def typeExercise = params.typeExercise
        def exercise
        if(typeExercise == 'Weight'){
            exercise = new Weight(params.name)
        }else{
            exercise = new Cardio(params.name)
        }

        if(exercise.save()){
            redirect(action:'index')
        }else{
            render(view: 'createExercise', model: [exercise:exercise])
        }
    }

    def listExercises() {
        def exercises = Exercise.list()
        [exercises: exercises] //esto se envia a la vista
    }
}
