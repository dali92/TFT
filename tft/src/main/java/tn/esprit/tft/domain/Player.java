package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import tn.esprit.tft.domain.Membre;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity
public class Player extends Membre implements Serializable {

	
	private String categorie;
	private Integer rangeP;
	private Integer scoreNat;
	private Integer scoreInt;
	private static final long serialVersionUID = 1L;
	private DoppingTest doppingTest;

	public Player() {
		super();
	}   
	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}   
	
	public Integer getRangeP() {
		return rangeP;
	}
	public void setRangeP(Integer rangeP) {
		this.rangeP = rangeP;
	}
	
	@ManyToOne
	@JoinColumn(name="dopppingTest")
	public DoppingTest getDoppingTest() {
		return doppingTest;
	}
	public void setDoppingTest(DoppingTest doppingTest) {
		this.doppingTest = doppingTest;
	}
	public Integer getScoreNat() {
		return scoreNat;
	}
	public void setScoreNat(Integer scoreNat) {
		this.scoreNat = scoreNat;
	}
	public Integer getScoreInt() {
		return scoreInt;
	}
	public void setScoreInt(Integer scoreInt) {
		this.scoreInt = scoreInt;
	}
   
}
