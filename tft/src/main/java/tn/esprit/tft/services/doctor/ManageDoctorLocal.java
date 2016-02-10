package tn.esprit.tft.services.doctor;

import java.util.List;

import javax.ejb.Local;


import tn.esprit.tft.domain.Doctor;

@Local
public interface ManageDoctorLocal {
	Boolean addDoctor(Doctor doctor);
	Boolean updateDoctor(Doctor doctor);
	Boolean deleteDoctor(Doctor doctor);
	List<Doctor> findAllDoctors();
}
