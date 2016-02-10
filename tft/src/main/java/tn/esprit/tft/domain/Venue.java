package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Venue
 *
 */
@MappedSuperclass

public class Venue implements Serializable {

	
	private Integer idVenue;
	private String addressVenue;
	private static final long serialVersionUID = 1L;

	public Venue() {
		super();
	}
    @Id
	public Integer getIdVenue() {
		return idVenue;
	}

	public void setIdVenue(Integer idVenue) {
		this.idVenue = idVenue;
	}

	public String getAddressVenue() {
		return addressVenue;
	}

	public void setAddressVenue(String addressVenue) {
		this.addressVenue = addressVenue;
	}   
	
}
