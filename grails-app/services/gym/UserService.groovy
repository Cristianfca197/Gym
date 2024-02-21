package gym

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    User login(String name) {
        User.findByName(name)
    }
}
