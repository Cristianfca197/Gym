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
}
