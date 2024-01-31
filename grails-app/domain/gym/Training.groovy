package gym

abstract class Training {

    static constraints = {
    }

    abstract Routine createRoutine(HashSet<Exercise> exercises)

    abstract Exercise addExercise(Exercise exercise)

    abstract Exercise addExerciseIncreasedWeight(Exercise exercise)

    abstract void addSeriesExercise(Exercise exercise)

}
