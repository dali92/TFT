package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Match
 *
 */
@Entity
@Table(name="t_match")

public class Match implements Serializable {

	
	private Integer idMatch;
	private String typeMatch;
	private Date dateMatch;
	private String resultMatch;
	private static final long serialVersionUID = 1L;
	private Refree refree;
	private Stadium stadium ; 

	public Match() {
		super();
	}   
	
	@ManyToOne
	@JoinColumn(name="refree")
	public Refree getRefree() {
		return refree;
	}
	public void setRefree(Refree refree) {
		this.refree = refree;
	}
	@ManyToOne
	@JoinColumn(name="stadium")
	public Stadium getStadium() {
		return stadium;
	}
	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}
    @Id
	public Integer getIdMatch() {
		return idMatch;
	}

	public void setIdMatch(Integer idMatch) {
		this.idMatch = idMatch;
	}

	public String getTypeMatch() {
		return typeMatch;
	}

	public void setTypeMatch(String typeMatch) {
		this.typeMatch = typeMatch;
	}

	public Date getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(Date dateMatch) {
		this.dateMatch = dateMatch;
	}

	public String getResultMatch() {
		return resultMatch;
	}

	public void setResultMatch(String resultMatch) {
		this.resultMatch = resultMatch;
	}
   
}
