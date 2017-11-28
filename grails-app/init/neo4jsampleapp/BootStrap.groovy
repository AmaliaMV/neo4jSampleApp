package neo4jsampleapp

import neo4jSampleApp.core.Club
import neo4jSampleApp.core.Player

class BootStrap {

    def init = { servletContext ->

        Club.withNewSession {
            Club.withNewTransaction {
                Club club = Club.findByName('Boca Jrs')

                if (!club) {
                    club = new Club(name: 'Boca Jrs')
                    club.save()

                    Player player1 = new Player(name: 'Juan Roman Riquelme', number: 10, club: club)
                    Player player2 = new Player(name: 'Martin Palermo', number: 9, club: club)
                    Player player3 = new Player(name: 'Mauricio Serna', number: 5, club: club)
                    Player player4 = new Player(name: 'Blass Armando Giunta', number: 8, club: club)
                    Player player5 = new Player(name: 'Walter Samuel', number: 2, club: club)

                    player1.save()
                    player2.save()
                    player3.save()
                    player4.save()
                    player5.save()
                }
            }
        }
    }
    def destroy = {
    }
}
