package gym

class ExerciseUser {

    //User user
    Exercise exercise
    //Series series

    static belongsTo = [user: User, exerciseList: ExerciseList]

    static hasMany = [series: Series]

    static constraints = {
    }

    ExerciseUser(Exercise exercise, User user){
        //this.user = user
        //this.exercise = exercise
    }

    String exerciseName(){
        this.exercise.getName()
    }
}
