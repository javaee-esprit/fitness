package edu.esprit.fitness.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.fitness.persistence.Player;
import edu.esprit.fitness.persistence.Team;

@Stateless
public class TournamentService implements TournamentServiceRemote, TournamentServiceLocal {

	@PersistenceContext
	private EntityManager em;
	
    public TournamentService() {
    }

	public void create(Team team) {
		em.persist(team);
	}

	public void create(Player player) {
		em.persist(player);
	}

	public void update(Team team) {
		em.merge(team);
	}

	public void update(Player player) {
		em.merge(player);
	}

	public Player findPlayer(int id) {
		return em.find(Player.class, id);
	}

	public Team findTeam(int id) {
		return em.find(Team.class, id);
	}

	public void delete(Team team) {
		em.remove(em.merge(team));
	}

	public List<Player> findPlayersByTeam(Team team) {
		List<Player> players = null;
		String jpql = "select p from Player p where p.team=:x";
		Query query = em.createQuery(jpql);
		query.setParameter("x", team);
		players = query.getResultList();
		return players;
	}

	public void tranfer(Player player, Team team) {
		Player managed = em.merge(player);
		managed.setTeam(team);
	}

	public void free(Player player) {
		Player managed = em.merge(player);
		managed.setTeam(null);
	}

}
