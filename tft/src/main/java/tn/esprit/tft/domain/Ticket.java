package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ticket
 *
 */
@Entity
@Table(name="t_ticket")

public class Ticket implements Serializable {

	
	private Integer idTicket;
	private String typeTicket;
	private Integer priceTicket;
	private Fan fan ; 
	private static final long serialVersionUID = 1L;

	public Ticket() {
		super();
	}   
	
	@ManyToOne
	@JoinColumn(name="fan")
	public Fan getFan() {
		return fan;
	}
	public void setFan(Fan fan) {
		this.fan = fan;
	}

	public Integer getPriceTicket() {
		return priceTicket;
	}

	public void setPriceTicket(Integer priceTicket) {
		this.priceTicket = priceTicket;
	}

	public String getTypeTicket() {
		return typeTicket;
	}

	public void setTypeTicket(String typeTicket) {
		this.typeTicket = typeTicket;
	}
    @Id
	public Integer getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(Integer idTicket) {
		this.idTicket = idTicket;
	}
   
}
