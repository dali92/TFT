package tn.esprit.tft.services.player;

import java.util.List;

import javax.ejb.Local;


import tn.esprit.tft.domain.Player;

@Local
public interface ManagePlayerLocal {
	Boolean addPlayer(Player player);
	Boolean updatePlayer(Player player);
	Boolean deletePlayer(Player player);
	List<Player> findAllPlayers();
}
