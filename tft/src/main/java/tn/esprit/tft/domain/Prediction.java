package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Prediction
 *
 */
@Entity
@Table(name="t_prediction")

public class Prediction implements Serializable {

	
	private Integer idPred;
	private Date datePred;
	private String pred;
	private Fan fan ; 
	private static final long serialVersionUID = 1L;

	public Prediction() {
		super();
	}   
	
	public String getPred() {
		return this.pred;
	}

	public void setPred(String pred) {
		this.pred = pred;
	}
	@ManyToOne
	@JoinColumn(name="fan")
	public Fan getFan() {
		return fan;
	}
	public void setFan(Fan fan) {
		this.fan = fan;
	}
    @Id
	public Integer getIdPred() {
		return idPred;
	}

	public void setIdPred(Integer idPred) {
		this.idPred = idPred;
	}

	public Date getDatePred() {
		return datePred;
	}

	public void setDatePred(Date datePred) {
		this.datePred = datePred;
	}
   
}
