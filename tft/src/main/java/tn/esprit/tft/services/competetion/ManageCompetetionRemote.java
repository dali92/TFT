package tn.esprit.tft.services.competetion;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.tft.domain.Competition;

@Remote
public interface ManageCompetetionRemote {
Boolean addCompetetion(Competition competition);
Boolean updateCompetetion(Competition competition);
Boolean deleteCompetetion(Competition competition);
List<Competition> findAllCompetetions();
}
