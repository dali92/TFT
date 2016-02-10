package tn.esprit.tft.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import tn.esprit.tft.domain.Membre;

/**
 * Entity implementation class for Entity: Fan
 *
 */
@Entity
@Table(name="t_fan")

public class Fan extends Membre implements Serializable {

	private List<Ticket> tickets ;
	private List<Prediction> predictions ; 
	private static final long serialVersionUID = 1L;

	public Fan() {
		super();
	}
	@OneToMany (mappedBy="fan")
	public List<Ticket> getTickets() {
		return tickets;
	}
	
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	@OneToMany (mappedBy="fan")
	public List<Prediction> getPredictions() {
		return predictions;
	}
	public void setPredictions(List<Prediction> predictions) {
		this.predictions = predictions;
	}
   
}
