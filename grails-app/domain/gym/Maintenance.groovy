package gym

class Maintenance extends Training{

    static constraints = {
    }

    void addSeriesExercise(Exercise exercise){
        exercise.setSerie(new Series(8, 90, 50))
    }

    Exercise addExercise(Exercise exercise){
        this.addSeriesExercise(exercise)
        exercise
    }

    Routine createRoutine(HashSet<Exercise> exercises){
        Routine routine = new Routine("Maintenance", this)
        for(exercise in exercises){
            routine.addExercise(this.addExercise(exercise))
        }
        routine
    }

    Exercise addExerciseIncreasedWeight(Exercise exercise){
        exercise.modifyValues(new Series(12, 60, 70))
        exercise
    }
}
