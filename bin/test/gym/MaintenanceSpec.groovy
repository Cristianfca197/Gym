package gym

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class MaintenanceSpec extends Specification implements DomainUnitTest<Maintenance> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true != false
    }
}
