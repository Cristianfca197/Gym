package gym

class Maintenance extends Training{

    static constraints = {
    }

    Routine createRoutine(ArrayList<Exercise> exercises){
        Routine routine = new Routine("Maintenance")
        for(exercise in exercises){
            exercise.set(new Set(8, 90, 50))
            routine.addExercise(exercise)
        }
        routine
    }
}
