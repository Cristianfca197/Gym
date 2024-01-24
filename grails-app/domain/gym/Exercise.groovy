package gym

abstract class Exercise {

    String name

    static constraints = {
    }

    Exercise(String name){
        this.name = name
    }

    abstract void set(Set set)
}
