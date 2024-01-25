package gym

class DropSet extends AdvancedTechnique{

    Exercise exercise
    Training training

    static constraints = {
    }

    DropSet(Exercise exercise, Training training){
        this.exercise = exercise
        this.training = training
    }

    Exercise getExercise(){
        WeightRange weightRange = training.getWeightRange()
        Exercise otherExercise = new Weight(exercise.name)
        otherExercise.set(new Series(12,90,70))
        otherExercise.set(new Series(12,90,60))
        otherExercise.set(new Series(12,90,50))
        otherExercise
        //arreglar esta hardcodeado para que "funcione"
    }
}
