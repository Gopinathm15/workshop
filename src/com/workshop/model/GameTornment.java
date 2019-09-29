package com.workshop.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.workshop.operations.Game;

public class GameTornment {

	private Map<String, Integer> gameResults = new HashMap<String, Integer>();

	public Map<String, Integer> playTorment(List<Game> games) {
		for (Game game : games) {
			updatePlayerScore(game.play());
		}
		return gameResults;
	}

	private void updatePlayerScore(List<Player> players) {
		players.forEach(player -> {
			if (gameResults.containsKey(player.getName())) {
				gameResults.put(player.getName(), gameResults.get(player.getName()) + player.getScore());
			} else {
				gameResults.put(player.getName(), player.getScore());
			}
		});
	}
}
