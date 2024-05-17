package gym

abstract class Exercise {

    String name

    //static belongsTo = [user: User, exerciseList: ExerciseList, exercisesUsers: ExerciseUser]

    //static hasMany = [series: Series]

    static constraints = {
        name nullable: false, blank: false
    }

    Exercise(String name){
        assert (!name || !name.trim().isEmpty())
        this.name = name
    }

    abstract void setSeries(int repetitions, int rest, int weight)

    abstract void modifyValues(int repetitions, int rest, int weight)

    abstract Series getFirstSeries()

    abstract int numberSeries()

    abstract  void deleteSeries()

    abstract boolean weightLess(int weight)

    abstract int getWeight()

    abstract void modifySeries(int serie, int rep, int rest, int weight)

    abstract int numberRepetitions()

    abstract boolean hasAdvancedTechnique()

    abstract void withAdvancedTechnique(AdvancedTechnique advancedTechnique)
}
