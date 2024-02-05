package gym

abstract class Exercise {

    String name

    static constraints = {
    }

    Exercise(String name){
        this.name = name
    }

    abstract void setSerie(int repetitions, int rest, int weight)

    abstract void modifyValues(int repetitions, int rest, int weight)

    abstract Series getSerie()

    abstract int numberSeries()

    abstract  void deleteSerie()

    abstract boolean weightLess(int weight)

    abstract int getWeight()

    abstract void modifySerie(int serie, int rep, int rest, int weight)

    abstract int numberRepetitions()

    abstract boolean hasAdvancedTechnique()

    abstract void withAdvancedTechnique(AdvancedTechnique advancedTechnique)
}
