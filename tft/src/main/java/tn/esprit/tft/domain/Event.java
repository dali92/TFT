package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@MappedSuperclass

public class Event implements Serializable {

	
	private Integer idEvent;
	private Date dateEvent;
	private String Location ; 
	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}   
	
	
	
	
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Date getDateEvent() {
		return dateEvent;
	}
	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}


    @Id
	public Integer getIdEvent() {
		return idEvent;
	}



	public void setIdEvent(Integer idEvent) {
		this.idEvent = idEvent;
	}



	
   
}
