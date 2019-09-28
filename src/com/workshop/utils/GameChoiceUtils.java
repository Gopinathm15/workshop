package com.workshop.utils;

import java.util.Random;

import com.workshop.constants.BotType;
import com.workshop.constants.UserChoice;

public class GameChoiceUtils {

	public static String getHumanRamdomChoice() {
		Random random = new Random();
		int randomInteger = random.nextInt(2);
		if (randomInteger == 1) {
			return UserChoice.COOPERATE.name();
		} else {
			return UserChoice.CHEAT.name();
		}
	}

	public static String getBotChoice(String botType) {

		if (botType.equalsIgnoreCase(BotType.EVIL.name())) {
			return UserChoice.CHEAT.name();
		}

		return UserChoice.COOPERATE.name();
	}

}
