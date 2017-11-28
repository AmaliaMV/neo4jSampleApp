package neo4jSampleApp.core

class Player extends BaseGraphDomain {

    String name
    Integer number

    static belongsTo = [club: Club]

    static constraints = {
        name nullable: false, blank: false, unique: true
        number nullable: false, validator: { it > 0 }
    }
}
