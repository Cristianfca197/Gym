package gym

class ExerciseUser {

    User user
    Exercise exercise
    ExerciseList exerciseList
    //Series series

    static belongsTo = [user: User, exerciseList: ExerciseList]

    static hasMany = [series: Series]

    static constraints = {
    }

    ExerciseUser(Exercise exercise, ExerciseList exerciseList, User user){
        this.user = user
        this.exercise = exercise
        this.exerciseList = exerciseList
    }

    String exerciseName(){
        this.exercise.getName()
    }
}
