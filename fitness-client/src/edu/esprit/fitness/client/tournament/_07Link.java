package edu.esprit.fitness.client.tournament;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.fitness.persistence.Player;
import edu.esprit.fitness.persistence.Team;
import edu.esprit.fitness.services.TournamentServiceRemote;

public class _07Link {
	
	public static void main(String[] args) throws NamingException{
		
		Context ctx = new InitialContext();
		
		TournamentServiceRemote remote = (TournamentServiceRemote) ctx.lookup("ejb:/fitness-ejb/TournamentService!edu.esprit.fitness.services.TournamentServiceRemote");
		Team t3 = remote.findTeam(3);
		
		Player p3 = remote.findPlayer(2);
		
		remote.tranfer(p3, t3);
	}

}
