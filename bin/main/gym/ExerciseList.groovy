package gym

class ExerciseList {

    String name

    static belongsTo = [user: User]

    static hasMany = [exercisesUser: ExerciseUser]

    static constraints = {
    }

    ExerciseList(String name, User user){
        this.name = name
        this.user = user
    }
}
