package gym

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class AdvancedTechniqueSpec extends Specification implements DomainUnitTest<AdvancedTechnique> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true != false
    }
}
