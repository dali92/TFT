package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.esprit.tft.domain.Event;

/**
 * Entity implementation class for Entity: Competition
 *
 */
@Entity
@Table(name="t_competition")

public class Competition extends Event implements Serializable {

	
	private String typeCompetetition;
	private String name;
	private Administrator administrator ;
	private static final long serialVersionUID = 1L;

	public Competition() {
		super();
	}   
	public String getTypeCompetetition() {
		return this.typeCompetetition;
	}

	public void setTypeCompetetition(String typeCompetetition) {
		this.typeCompetetition = typeCompetetition;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@ManyToOne
	@JoinColumn(name="administrator")
	public Administrator getAdministrator() {
		return administrator;
	}
	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
   
}
