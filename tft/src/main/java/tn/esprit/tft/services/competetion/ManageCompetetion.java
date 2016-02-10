package tn.esprit.tft.services.competetion;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.tft.domain.Competition;


/**
 * Session Bean implementation class ManageCompetetion
 */
@Stateless
public class ManageCompetetion implements ManageCompetetionRemote, ManageCompetetionLocal {

	@PersistenceContext(unitName="tft")
    EntityManager entityManager;
    public ManageCompetetion() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addCompetetion(Competition competition) {
		try{
			entityManager.persist(competition);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public Boolean updateCompetetion(Competition competition) {
		try{
			entityManager.merge(competition);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public Boolean deleteCompetetion(Competition competition) {
		try{
			entityManager.remove(entityManager.merge(competition));
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public List<Competition> findAllCompetetions() {
		Query query = entityManager.createQuery("Select b from Competition b");
		List<Competition> result = query.getResultList();
		return result;
	}

}
