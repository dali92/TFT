package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TrainingSession
 *
 */
@Entity
@Table(name="t_trainingSession")

public class TrainingSession implements Serializable {

	
	private Integer idTs;
	private Date date;
	private String subject;
	private String duration;
	private Integer nbMax;
	private String place;
	private static final long serialVersionUID = 1L;
    private List<Refree> refrees;
	public TrainingSession() {
		super();
	}   
	
	
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@ManyToMany
	public List<Refree> getRefrees() {
		return refrees;
	}
	public void setRefrees(List<Refree> refrees) {
		this.refrees = refrees;
	}
    @Id
	public Integer getIdTs() {
		return idTs;
	}

	public void setIdTs(Integer idTs) {
		this.idTs = idTs;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public Integer getNbMax() {
		return nbMax;
	}


	public void setNbMax(Integer nbMax) {
		this.nbMax = nbMax;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}
	
   
}
