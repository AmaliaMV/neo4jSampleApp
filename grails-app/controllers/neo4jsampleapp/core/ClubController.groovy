package neo4jsampleapp.core

import neo4jSampleApp.core.Club

import grails.rest.*
import grails.converters.*

class ClubController {
	static responseFormats = ['json', 'xml']
	
    def index() {
        respond Club.list()
    }
}
