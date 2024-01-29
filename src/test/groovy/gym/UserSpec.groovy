package gym

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class UserSpec extends Specification implements DomainUnitTest<User> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true != false
    }

    void "Create a User"(){
        given:"I want to create a User"
        when:"I create a User"
            User user = new User("Cristian")
        then:"It is created correctly"
            user != null
    }

    void "Add an Exercise"(){
        given:"A User and Exercise"
            User user = new User("Cris")
            Exercise exercise = new Weight("Bench Press")
        when:"Add the Exercise to exercise list"
            user.addExercise(exercise)
        then:"The Exercise is saved correctly"
            user.quantityExercise() == 1
    }

    void "Create a Routine"(){
        given:"A User with a list of exercises and a training program"
            User user = new User("Cris")
            Exercise exercise = new Weight("Bench Press")
            Training training = new Maintenance()
            user.addExercise(exercise)
        when:"A Routine is created"
            Routine routine = user.createRoutine(training)
        then:"The Routine is created correctly"
            routine != null
    }

    void "Modify an Exercise from a Routine"(){
        given:"A Maintenance Routine"
        User user = new User("Cris")
        Exercise exercise = new Weight("Bench Press")
        Training training = new Maintenance()
        user.addExercise(exercise)
        Routine routine = user.createRoutine(training)
        when:"I want to add a Series to an Exercise"
        user.addSeriesExercise(exercise, routine)
        then:"The Series is added correctly"
        user.numberExerciseSeries(exercise, routine) == 2
    }

    //void "You cannot create a Routine with a cardio Exercise"

    /*void "The values of an Exercise within a training plan can be modified"() {
        given: "A User with a Training plan"
            User user = new User("Cris")
            Exercise exercise = new Weight("Bench Press")
            Training training = new Maintenance()
            user.addExercise(exercise)
            Routine routine = user.createRoutine(training)
        when:"Want to modify the values of an Exercise"
            user.modifyExercise()
        then:"These values can be modified"
    }*/
}
