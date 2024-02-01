package gym

abstract class Training {

    static constraints = {
    }

    abstract Routine createRoutine(HashSet<Exercise> exercises)

    abstract Exercise addExercise(Exercise exercise)

    abstract Exercise addExerciseIncreasedWeight(Exercise exercise)

    abstract void addSeriesExercise(Exercise exercise)

    abstract  boolean  validValues(int rep, int rest, int weight)

    abstract void changeSeriesExercise(int rep, int rest, int weight, Exercise exercise)

    abstract  void deleteSeriesExercise(Exercise exercise)

    abstract boolean allowsWeightProgression(Routine routine)
}
