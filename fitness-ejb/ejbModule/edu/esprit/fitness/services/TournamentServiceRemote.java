package edu.esprit.fitness.services;

import javax.ejb.Remote;

import edu.esprit.fitness.persistence.Player;
import edu.esprit.fitness.persistence.Team;

@Remote
public interface TournamentServiceRemote {
	
	void create(Team team);
	void create(Player player);
	void update(Team team);
	void update(Player player);
	Player findPlayer(int id);
	Team findTeam(int id);
	void delete(Team team);

}
