package com.workshop.operations;

import java.util.LinkedList;
import java.util.List;

import com.workshop.model.Player;

public class Game {

	public List<Player> play(int rounds, List<Player> players) {
		List<Player> gameResult = new LinkedList<>();
		Player player1 = players.get(0);
		Player player2 = players.get(1);
		GameRule gameRule = new GameRule();
		for (int i = 0; i < rounds; i++) {
			player1.pickChoice();
			player2.pickChoice();
			List<Integer> output = gameRule.getScoreBasedOnRule(player1, player2);
			player1.addScore(output.get(0));
			player2.addScore(output.get(1));
			player2.setChoice(player1.getChoice());
		}
		gameResult.add(player1);
		gameResult.add(player2);
		return gameResult;
	}

}
