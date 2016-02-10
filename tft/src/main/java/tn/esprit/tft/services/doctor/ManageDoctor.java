package tn.esprit.tft.services.doctor;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.tft.domain.Competition;
import tn.esprit.tft.domain.Doctor;

/**
 * Session Bean implementation class ManageDoctor
 */
@Stateless
public class ManageDoctor implements ManageDoctorRemote, ManageDoctorLocal {

	@PersistenceContext(unitName="tft")
    EntityManager entityManager;
    public ManageDoctor() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addDoctor(Doctor doctor) {
		try{
			entityManager.persist(doctor);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public Boolean updateDoctor(Doctor doctor) {
		try{
			entityManager.merge(doctor);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public Boolean deleteDoctor(Doctor doctor) {
		try{
			entityManager.remove(entityManager.merge(doctor));
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public List<Doctor> findAllDoctors() {
		Query query = entityManager.createQuery("Select b from Doctor b");
		List<Doctor> result = query.getResultList();
		return result;
	}

}
