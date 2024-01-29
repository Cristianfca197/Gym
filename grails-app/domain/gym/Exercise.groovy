package gym

abstract class Exercise {

    String name

    static constraints = {
    }

    Exercise(String name){
        this.name = name
    }

    abstract void setSerie(Series serie)

    abstract void modifyValues(Series set)

    abstract Series getSerie()

    abstract int numberSeries()
}
