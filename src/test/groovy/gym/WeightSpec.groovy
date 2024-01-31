package gym

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class WeightSpec extends Specification implements DomainUnitTest<Weight> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true != false
    }

    void "Create a Weight Exercise is correct"(){
        given:"I want to create a Weight Exercise"
        when:"I create the Weight Exercise"
            Exercise exercise = new Weight("Bench Press")
        then:"It is created successfully"
            exercise != null
    }

    void "The number of series of a newly Exercise is zero"(){
        given:"A Weight Exercise"
            Exercise exercise = new Weight("Bench Press")
        when:"I want to know the number of series os the Exercise"
            int series = exercise.numberSeries()
        then:"The number of series is zero"
            series == 0
    }

    void "Adding a series to an exercise is possible"(){
        given:"A Weight Exercise"
            Exercise exercise = new Weight("Bench Press")
        when:"I want to add a set to the exercise"
            exercise.setSerie(8, 80, 60)
        then:"The series is added and the number of series is one"
            exercise.numberSeries() == 1
    }
}
