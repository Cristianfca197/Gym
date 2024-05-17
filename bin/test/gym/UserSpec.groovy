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

    void "Adding a Series to an Exercise from a Routine"(){
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

    void "Eliminating a Series to an Exercise from a Routine is possible"(){
        given:"A Maintenance Routine and a Weight Exercise with two Series"
            User user = new User("Cris")
            Exercise exercise = new Weight("Bench Press")
            Training training = new Maintenance()
            user.addExercise(exercise)
            Routine routine = user.createRoutine(training)
            user.addSeriesExercise(exercise, routine)
        when:"I want to delete a Series to an Exercise"
            user.deleteSeriesExercise(exercise, routine)
        then:"The Series is deleted correctly"
            user.numberExerciseSeries(exercise, routine) == 1
    }

    void "Change the values of the series of an Exercise from a Routine"(){
        given:"A Maintenance Routine"
            User user = new User("Cris")
            Exercise exercise = new Weight("Bench Press")
            Training training = new Maintenance()
            user.addExercise(exercise)
            Routine routine = user.createRoutine(training)
        when:"I want to change the values of the series of an exercise"
            user.changeSeriesExercise(10, 80, 60, exercise, routine)
        then:"The Series is modified correctly"
            Series serie = user.getSeriesExercise(exercise, routine)
            serie.compareValues(new Series(10, 80, 60))
    }

    void "Create the Program based on a routine"(){
        given:"There is a Routine"
            User user = new User("Cris")
            Exercise exercise = new Weight("Bench Press")
            Training training = new Maintenance()
            user.addExercise(exercise)
            Routine routine = user.createRoutine(training)
        when:"I want to get my training Program"
            IncreasedWeight increasedWeight = new IncreasedWeight()
            Program program = user.createProgram(routine, increasedWeight)
        then:"The training Program is created correctly"
            program != null
    }

    void "Create an Exercise Routine with Advanced Technique"(){
        given:"There is a Routine and an Exercise that allows DropSet"
            User user = new User("Cris")
            Exercise exercise = new Weight("Bench Press")
            Training training = new Maintenance()
            user.addExercise(exercise)
            Routine routine = user.createRoutine(training)
            user.addSeriesExercise(exercise, routine)
            user.addSeriesExercise(exercise, routine)
            user.changeSeriesExercise(12, 60, 70, exercise, routine)
        when:"I want to obtain the Routine of an Exercise with Advanced Technique"
            DropSet dropSet = new DropSet()
            user.createAdvancedTechnique(exercise, dropSet, routine)
        then:"The values of the Advances Technique are set correctly"
            assert user.exerciseWithAdvancedTechnique(exercise, routine)
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
