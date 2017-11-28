package neo4jSampleApp.core.neo4jSampleApp.core

import neo4jSampleApp.core.BaseGraphDomain

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BaseGraphDomainSpec extends Specification implements DomainUnitTest<BaseGraphDomain> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
