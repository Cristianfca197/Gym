package gym

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    User login(String name) {
        User.findByName(name)
    }

    ExerciseList createExerciseList(long userId, String nameList){
        User user = User.findById(userId)
        ExerciseList exerciseList = user.createExerciseList(nameList)
        exerciseList.save(failOnError: true)
    }

    void addExercisesInList(long listUserId, List selectedExercisesId){
        ExerciseList exerciseList = ExerciseList.findById(listUserId)
        for(id in selectedExercisesId){
            Exercise exercise = Exercise.findById(id as long)
            ExerciseUser exerciseUser = exerciseList.addExercise(exercise)
            exerciseUser.save(failOnError: true)
        }
    }
}
