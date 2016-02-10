package tn.esprit.tft.services.competetion;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.tft.domain.Competition;

@Local
public interface ManageCompetetionLocal {
	Boolean addCompetetion(Competition competition);
	Boolean updateCompetetion(Competition competition);
	Boolean deleteCompetetion(Competition competition);
	List<Competition> findAllCompetetions();
}
