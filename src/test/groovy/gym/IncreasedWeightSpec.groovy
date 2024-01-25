package gym

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class IncreasedWeightSpec extends Specification implements DomainUnitTest<IncreasedWeight> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true != false
    }

    void "Creating a Training Program is possible"(){
        given:"A Routine that allows progression"
            Exercise exercise = new Weight("Bench press")
            Training training = new Maintenance()
            Routine routine = new Routine("Maintance", training)
            routine.addExercise(exercise)
        when:"I want to create a Program for the routine"
            Program program = new IncreasedWeight(routine)
        then:"The Program is created successfully"
            program != null
    }
}
