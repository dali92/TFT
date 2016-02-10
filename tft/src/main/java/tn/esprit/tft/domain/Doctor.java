package tn.esprit.tft.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import tn.esprit.tft.domain.Membre;

/**
 * Entity implementation class for Entity: Doctor
 *
 */
@Entity
@Table(name="t_doctor")

public class Doctor extends Membre implements Serializable {

	private List<DoppingTest> doppingTests;
	private static final long serialVersionUID = 1L;
	

	public Doctor() {
		super();
	}


	

   @OneToMany (mappedBy="doctor")
	public List<DoppingTest> getDoppingTests() {
		return doppingTests;
	}


	public void setDoppingTests(List<DoppingTest> doppingTests) {
		this.doppingTests = doppingTests;
	}
   
}
