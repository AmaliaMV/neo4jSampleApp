package neo4jsampleapp.core

import neo4jSampleApp.core.Player

import grails.rest.*
import grails.converters.*

class PlayerController {
	static responseFormats = ['json', 'xml']
	
    def index() {
        respond Player.list()
    }

    def show(Long id) {

        Player player = Player.get(id)
        respond player
    }

    def showClub(Long id) {

        Player player = Player.get(id)
        respond player.club
    }
}
