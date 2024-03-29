package com.workshop.model;

import com.workshop.constants.UserChoice;

public class CopyCatBot extends Player {

	private String playerChoice = null;

	public CopyCatBot(String type) {
		super(type);
	}

	@Override
	public String getChoice() {
		return super.getChoice();
	}

	@Override
	public void pickChoice() {
		if (playerChoice != null) {
			super.setChoice(playerChoice);
		} else {
			super.setChoice(UserChoice.COOPERATE.name());
		}
	}

	@Override
	public void holdPlayerChoice(String playerChoice) {
		this.playerChoice = playerChoice;
	}

}
