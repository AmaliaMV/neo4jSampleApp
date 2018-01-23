package neo4jSampleApp.core

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Player extends BaseGraphDomain {

    String name
    Integer number

    List attributes

    static belongsTo = [club: Club]

    static constraints = {
        name nullable: false, blank: false, unique: true
        number nullable: false, validator: { (Integer) it > 0 }
        attributes nullable: true
    }
}
