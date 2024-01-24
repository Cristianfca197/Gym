package gym

abstract class Training {

    static constraints = {
    }

    abstract Routine createRoutine(ArrayList<Exercise> exercises)

    abstract Exercise addExercise(Exercise exercise)
}
