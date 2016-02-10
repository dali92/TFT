package tn.esprit.tft.services.player;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.tft.domain.Player;

@Remote
public interface ManagePlayerRemote {
	Boolean addPlayer(Player player);
	Boolean updatePlayer(Player player);
	Boolean deletePlayer(Player player);
	List<Player> findAllPlayers();
}
