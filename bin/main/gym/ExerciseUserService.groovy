package gym

import grails.gorm.transactions.Transactional

@Transactional
class ExerciseUserService {

    List exercisesUser(User user) {
        ExerciseUser.findAllByUser(user)
    }
}
