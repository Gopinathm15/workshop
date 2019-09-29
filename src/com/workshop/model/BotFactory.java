package com.workshop.model;

import com.workshop.constants.BotType;
import com.workshop.model.CopyCatBot;
import com.workshop.model.EvilBot;
import com.workshop.model.Grodger;
import com.workshop.model.KindBot;
import com.workshop.model.Player;

public class BotFactory {

	public static Player getPlayer(BotType botType) {
		switch (botType.name().toUpperCase()) {
		case "KINDBOT":
			return new KindBot(BotType.KINDBOT.name());
		case "EVIL":
			return new EvilBot(BotType.EVIL.name());
		case "COPYCAT":
			return new CopyCatBot(BotType.COPYCAT.name());
		case "GRODGER":
			return new Grodger(BotType.GRODGER.name());
		}
		return new KindBot(BotType.KINDBOT.name());
	}
}