package edu.esprit.fitness.client.tournament;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.fitness.persistence.Player;
import edu.esprit.fitness.persistence.Team;
import edu.esprit.fitness.services.TournamentServiceRemote;

public class _02LinkPlayerToTeams {
	
	public static void main(String[] args) throws NamingException{
		
		Context ctx = new InitialContext();
		
		TournamentServiceRemote remote = (TournamentServiceRemote) ctx.lookup("ejb:/fitness-ejb/TournamentService!edu.esprit.fitness.services.TournamentServiceRemote");
		
		Player p1 = remote.findPlayer(1);
		Player p2 = remote.findPlayer(2);
		
		Team t1 = remote.findTeam(1);
		
		p1.setTeam(t1);
		p2.setTeam(t1);
		
		remote.update(p1);
		remote.update(p2);
		
	}

}
