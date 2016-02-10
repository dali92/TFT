package tn.esprit.tft.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import tn.esprit.tft.domain.Membre;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity
@Table(name="t_administrator")

public class Administrator extends Membre implements Serializable {

	private List<Competition> competitions ;
	private List<CharityEvent> charityEvents;
	private List<News> news ; 
	private static final long serialVersionUID = 1L;

	public Administrator() {
		super();
	}
  
	
	 @OneToMany (mappedBy="administrator")
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}

	@OneToMany (mappedBy="administrator")
	public List<Competition> getCompetitions() {
		return competitions;
	}


	public void setCompetitions(List<Competition> competitions) {
		this.competitions = competitions;
	}

	@OneToMany (mappedBy="administrator")
	public List<CharityEvent> getCharityEvents() {
		return charityEvents;
	}


	public void setCharityEvents(List<CharityEvent> charityEvents) {
		this.charityEvents = charityEvents;
	}
   
}
