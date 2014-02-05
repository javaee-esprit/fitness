package edu.esprit.fitness.client.tournament;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.fitness.persistence.Player;
import edu.esprit.fitness.persistence.Team;
import edu.esprit.fitness.services.TournamentServiceRemote;

public class _04FetchingPlayers {
	
	public static void main(String[] args) throws NamingException{
		
		Context ctx = new InitialContext();
		
		TournamentServiceRemote remote = (TournamentServiceRemote) ctx.lookup("ejb:/fitness-ejb/TournamentService!edu.esprit.fitness.services.TournamentServiceRemote");
	
		Team t1 = remote.findTeam(1);
		List<Player> players = t1.getPlayers();
		
		for(Player p:players)
			System.out.println(p);
 	}

}
