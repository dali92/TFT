package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.esprit.tft.domain.Event;

/**
 * Entity implementation class for Entity: CharityEvent
 *
 */
@Entity
@Table(name="t_charityEvent")

public class CharityEvent extends Event implements Serializable {

	
	private String name;
	private Administrator administrator ;
	private static final long serialVersionUID = 1L;

	public CharityEvent() {
		super();
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
