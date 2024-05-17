package gym

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    User login(String name) {
        User.findByName(name)
    }

    ExerciseUser addExercise(long userId, long exerciseId){
        User user = User.findById(userId)
        Exercise exercise = Exercise.findById(exerciseId)

        ExerciseUser exerciseUser = user.addExercise(exercise)
        exerciseUser.save(failOnError: true)
    }
}
