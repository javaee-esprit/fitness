package edu.esprit.fitness.client.tournament;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.fitness.persistence.Player;
import edu.esprit.fitness.persistence.Team;
import edu.esprit.fitness.services.TournamentServiceRemote;

public class _01Create4PlayersAnd2Teams {
	
	public static void main(String[] args) throws NamingException{
		
		Context ctx = new InitialContext();
		
		TournamentServiceRemote remote = (TournamentServiceRemote) ctx.lookup("ejb:/fitness-ejb/TournamentService!edu.esprit.fitness.services.TournamentServiceRemote");
		
		Team t1 = new Team(1, "Real");
		Team t2 = new Team(2, "Barcelona");
		
		Player  p1 =  new Player(1, "Ronaldo");
		Player  p2 =  new Player(2, "Casillas");
		Player  p3 =  new Player(3, "Messi");
		Player  p4 =  new Player(4, "Xavi");
		
		remote.create(t1);
		remote.create(t2);
		
		remote.create(p1);
		remote.create(p2);
		remote.create(p3);
		remote.create(p4);
		
	}

}
