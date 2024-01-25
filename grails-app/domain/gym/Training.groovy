package gym

abstract class Training {

    static constraints = {
    }

    abstract Routine createRoutine(ArrayList<Exercise> exercises)

    abstract Exercise addExercise(Exercise exercise)

    abstract Exercise addExerciseIncreasedWeight(Exercise exercise)

    abstract  WeightRange getWeightRange()

    abstract  RepRange getRepRange()
}
