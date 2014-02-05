package edu.esprit.fitness.client.tournament;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.fitness.persistence.Player;
import edu.esprit.fitness.persistence.Team;
import edu.esprit.fitness.services.TournamentServiceRemote;

public class _05CascadePersist {
	
	public static void main(String[] args) throws NamingException{
		
		Context ctx = new InitialContext();
		
		TournamentServiceRemote remote = (TournamentServiceRemote) ctx.lookup("ejb:/fitness-ejb/TournamentService!edu.esprit.fitness.services.TournamentServiceRemote");
		
		
		Team t3 = new Team(3, "ST");
		
		Player p5 = new Player(5, "Sallemi");
		Player p6 = new Player(6, "Aouadhi");
		
		List<Player> players = new ArrayList<Player>();
		players.add(p5);
		players.add(p6);
		
		t3.setPlayers(players);
		
		p5.setTeam(t3);
		p6.setTeam(t3);
		
		remote.create(t3);
	}

}
