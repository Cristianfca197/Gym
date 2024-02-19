package gym

abstract class AdvancedTechnique {

    static constraints = {
        nullable: true
    }

    abstract void setValues(Exercise exercise, Training training)
}
