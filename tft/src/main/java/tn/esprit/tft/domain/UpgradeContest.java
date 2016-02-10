package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: UpgradeContest
 *
 */
@Entity
@Table(name="t_upgradeContest")

public class UpgradeContest implements Serializable {

	
	private Integer idUc;
	private Date dateUc;
	private Integer level;
	private Integer nbMax;
	private String place;
	private String duration;
	private static final long serialVersionUID = 1L;
	private List<Refree> refrees;

	public UpgradeContest() {
		super();
	}   
	
	@ManyToMany
	public List<Refree> getRefrees() {
		return refrees;
	}
	public void setRefrees(List<Refree> refrees) {
		this.refrees = refrees;
	}
    @Id
	public Integer getIdUc() {
		return idUc;
	}

	public void setIdUc(Integer idUc) {
		this.idUc = idUc;
	}

	public Date getDateUc() {
		return dateUc;
	}

	public void setDateUc(Date dateUc) {
		this.dateUc = dateUc;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
   
}
