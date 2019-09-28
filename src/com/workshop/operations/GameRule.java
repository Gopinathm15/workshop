package com.workshop.operations;

import java.util.LinkedList;
import java.util.List;

import com.workshop.constants.BotType;
import com.workshop.constants.UserChoice;
import com.workshop.model.Player;

public class GameRule {

	public List<Integer> getScoreBasedOnRule(Player player1, Player player2) {
		List<Integer> output = new LinkedList();
		String player1Choice = player1.getChoice();
		String player2Choice = player2.getChoice();
		if (player1Choice.equalsIgnoreCase(UserChoice.COOPERATE.name())
				&& player2Choice.equalsIgnoreCase(UserChoice.COOPERATE.name())) {
			output.add(0, 2);
			output.add(1, 2);
		} else if (player1Choice.equalsIgnoreCase(UserChoice.COOPERATE.name())
				&& player2Choice.equalsIgnoreCase(UserChoice.CHEAT.name())) {
			output.add(0, -1);
			output.add(1, 3);
		} else if (player1Choice.equalsIgnoreCase(UserChoice.CHEAT.name())
				&& player2Choice.equalsIgnoreCase(UserChoice.COOPERATE.name())) {
			output.add(0, 3);
			output.add(1, -1);
		} else if (player1Choice.equalsIgnoreCase(UserChoice.CHEAT.name())
				&& player2Choice.equalsIgnoreCase(UserChoice.CHEAT.name())) {
			output.add(0, 0);
			output.add(1, 0);
		}
		return output;
	}
	
	
}
