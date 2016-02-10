package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.util.List;

import javax.persistence.*;
import tn.esprit.tft.domain.Venue;

/**
 * Entity implementation class for Entity: Stadium
 *
 */
@Entity
@Table(name="t_stadium")

public class Stadium extends Venue implements Serializable {

	
	private Integer capacity;
	private List<Match> matchs ; 
	private static final long serialVersionUID = 1L;

	public Stadium() {
		super();
	}   
	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	@OneToMany (mappedBy="stadium")
	public List<Match> getMatchs() {
		return matchs;
	}
	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}
   
}
