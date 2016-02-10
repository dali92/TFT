package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DoppingTest
 *
 */
@Entity
@Table(name="t_doppingTest")

public class DoppingTest implements Serializable {

	
	private Integer idDt;
	private Date dateDt;
	private String resultDt;
	private static final long serialVersionUID = 1L;
	private List<Player> players;
	private Doctor doctor;

	public DoppingTest() {
		super();
	}   
	
	@OneToMany (mappedBy="doppingTest")
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	@ManyToOne
	@JoinColumn(name="dopppingTest")
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
    @Id
	public Integer getIdDt() {
		return idDt;
	}

	public void setIdDt(Integer idDt) {
		this.idDt = idDt;
	}

	public Date getDateDt() {
		return dateDt;
	}

	public void setDateDt(Date dateDt) {
		this.dateDt = dateDt;
	}

	public String getResultDt() {
		return resultDt;
	}

	public void setResultDt(String resultDt) {
		this.resultDt = resultDt;
	}
	
   
}
