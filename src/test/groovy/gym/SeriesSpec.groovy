package gym

import grails.testing.gorm.DomainUnitTest
import org.codehaus.groovy.runtime.powerassert.PowerAssertionError
import spock.lang.Specification

class SeriesSpec extends Specification implements DomainUnitTest<Series> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true != false
    }

    void "test create Series"(){
        given:"I want to create a Series with allowed values "
        when:"I create a new series"
            Series series = new Series(12, 60, 80)
        then:"It is created successfully"
            series != null
    }

    void "test create Series negative case"(){
        given:"I want to create a Series with illegal values"
        when:"I create a new series"
        new Series(0, 0, 0)
        then:"It is created successfully"
        thrown(PowerAssertionError)
    }

    void "test copying values works correctly"(){
        given:"Two Series"
            Series series = new Series(12, 60, 80)
            Series otherSeries = new Series(8, 90, 60)
        when:"I copy the values from one to another"
            series.copyValues(otherSeries)
        then:"It works correctly"
            series.compareValues(otherSeries)
    }

    void "test weight less works correctly"(){
        given:"A Series"
            Series series = new Series(12, 60, 80)
        when:"I compare the weight with another"
        then:"It works correctly"
            series.weightLessThan(100)
    }

    void "test weight less works correctly negative case"(){
        given:"A Series"
        Series series = new Series(12, 60, 80)
        when:"I compare the weight with another"
        then:"It works correctly"
        !series.weightLessThan(60)
    }
}
