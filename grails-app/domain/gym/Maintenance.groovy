package gym

class Maintenance extends Training{

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
        exercise.set(new Set(8, 90, 50))
        exercise
    }
}
