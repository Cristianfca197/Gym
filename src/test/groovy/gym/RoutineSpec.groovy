package gym

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class RoutineSpec extends Specification implements DomainUnitTest<Routine> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true != false
    }

    void "Create a Routine"(){
        given:"A Training plan"
            Training training = new Maintenance()
        when:"I want to create a Routine"
            Routine routine = new Routine("My routine", training)
        then:"the Routine is created correctly"
            routine != null
    }

    void "Add an exercise to a Routine"(){
        given:"A Routine and an Exercise"
            Training training = new Maintenance()
            Routine routine = new Routine("My routine", training)
            Exercise exercise = new Weight("Bench press")
        when:"I want to add an Exercise to the Routine"
            routine.addExercise(exercise)
        then:"It is added correctly"
            routine.quantityExercise() == 1
    }

     /*void "Modifying an Exercise within a Routine with Training plan is possible"(){
         given:"A complete Routine"
             Training training = new Maintenance()
             Routine routine = new Routine("My routine", training)
             Exercise exercise = new Weight("Bench press")
             routine.addExercise(exercise)
         when:"I want to modify the values of an Exercise within the Training plan"
            routine.modifyExerciseWith(exercise, 12, 60, 70)
         then:"Their values are modified correctly"
            exercise.compareValues(12, 60, 70)
     }*/
}
