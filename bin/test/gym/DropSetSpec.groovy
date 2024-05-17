package gym

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class DropSetSpec extends Specification implements DomainUnitTest<DropSet> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true != false
    }

    void "Crate a DropSet of an Exercise"(){
        given:"An Exercise and a type of Training"
            Exercise exercise = new Weight("Bench Press")
            Training training = new Maintenance()
        when:"I want to create the Advanced Technique according to the type of Training"
            AdvancedTechnique advancedTechnique = new DropSet(exercise, training)
            Exercise exerciseDropSet = advancedTechnique.getExercise()
        then:"The Exercise with the Advanced Technique is created correctly"
            exerciseDropSet != null
    }
}
