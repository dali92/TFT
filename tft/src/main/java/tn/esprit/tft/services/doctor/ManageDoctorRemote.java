package tn.esprit.tft.services.doctor;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.tft.domain.Doctor;

@Remote
public interface ManageDoctorRemote {
	Boolean addDoctor(Doctor doctor);
	Boolean updateDoctor(Doctor doctor);
	Boolean deleteDoctor(Doctor doctor);
	List<Doctor> findAllDoctors();
}
