package gym

class ExerciseUser {

    User user
    Exercise exercise
    //Series series

    static constraints = {
    }

    ExerciseUser(Exercise exercise, User user){
        this.user = user
        this.exercise = exercise
    }

    String exerciseName(){
        this.exercise.getName()
    }
}
