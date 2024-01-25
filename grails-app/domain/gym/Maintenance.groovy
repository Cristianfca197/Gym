package gym

class Maintenance extends Training{

    WeightRange weightRange = [50, 60, 70]
    RepRange repRange = [8,10,12]

    static constraints = {
    }

    Routine createRoutine(ArrayList<Exercise> exercises){
        Routine routine = new Routine("Maintenance", this)
        for(exercise in exercises){
            routine.addExercise(this.addExercise(exercise))
        }
        routine
    }

    Exercise addExercise(Exercise exercise){
        exercise.set(new Series(8, 90, 50))
        exercise
    }

    Exercise addExerciseIncreasedWeight(Exercise exercise){
        exercise.modifyValues(new Series(12, 60, 70))
        exercise
    }

    WeightRange getWeightRange(){
        weightRange
    }

    RepRange getRepRange(){
        repRange
    }
}
