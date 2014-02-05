package edu.esprit.fitness.services;

import java.util.List;

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
	List<Player> findPlayersByTeam(Team team);
	void tranfer(Player player, Team team);
	void free(Player player);

}
