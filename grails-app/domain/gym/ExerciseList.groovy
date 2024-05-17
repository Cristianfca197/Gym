package gym

class ExerciseList {

    String name
    User user

    static belongsTo = [user: User]

    static hasMany = [exercisesUser: ExerciseUser]

    static constraints = {
    }

    ExerciseList(String name, User user){
        this.name = name
        this.user = user
    }

    ExerciseUser addExercise(Exercise exercise){
        ExerciseUser exerciseUser = new ExerciseUser(exercise, this, this.user)
        exerciseUser
    }
}
