package tn.esprit.tft.domain;

import java.util.List;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.esprit.tft.domain.Membre;

/**
 * Entity implementation class for Entity: Refree
 *
 */
@Entity

public class Refree extends Membre implements Serializable {

	
	private String grade;
	private static final long serialVersionUID = 1L;
	private List<TrainingSession> trainingSessions;
	private List<UpgradeContest> upgradeContests;
	private List<Match> matchs;

	public Refree() {
		super();
	}   
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	@ManyToMany(mappedBy="refrees")
	public List<TrainingSession> getTrainingSessions() {
		return trainingSessions;
	}
	public void setTrainingSessions(List<TrainingSession> trainingSessions) {
		this.trainingSessions = trainingSessions;
	}
	@ManyToMany(mappedBy="refrees")
	public List<UpgradeContest> getUpgradeContests() {
		return upgradeContests;
	}
	public void setUpgradeContests(List<UpgradeContest> upgradeContests) {
		this.upgradeContests = upgradeContests;
	}
	@OneToMany(mappedBy="refree")
	public List<Match> getMatchs() {
		return matchs;
	}
	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}
   
}
