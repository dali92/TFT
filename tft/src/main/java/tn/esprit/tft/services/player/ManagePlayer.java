package tn.esprit.tft.services.player;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.tft.domain.Doctor;
import tn.esprit.tft.domain.Player;

/**
 * Session Bean implementation class ManagePlayer
 */
@Stateless
public class ManagePlayer implements ManagePlayerRemote, ManagePlayerLocal {

	@PersistenceContext(unitName="tft")
    EntityManager entityManager;
    public ManagePlayer() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addPlayer(Player player) {
		try{
			entityManager.persist(player);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public Boolean updatePlayer(Player player) {
		try{
			entityManager.merge(player);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public Boolean deletePlayer(Player player) {
		try{
			entityManager.remove(entityManager.merge(player));
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public List<Player> findAllPlayers() {
		Query query = entityManager.createQuery("Select b from Player b");
		List<Player> result = query.getResultList();
		return result;
	}

}
