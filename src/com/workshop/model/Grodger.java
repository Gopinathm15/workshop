package com.workshop.model;

import com.workshop.constants.UserChoice;

public class Grodger extends Player {

	private boolean isCheated = false;

	public Grodger(String type) {
		super(type);
	}

	@Override
	public String getChoice() {
		return super.getChoice();
	}

	@Override
	public void pickChoice() {
		if (isCheated) {
			super.setChoice(UserChoice.CHEAT.name());
		} else {
			super.setChoice(UserChoice.COOPERATE.name());
		}
	}

	@Override
	public void holdPlayerChoice(String playerChoice) {
		if (!isCheated) {
			if (playerChoice.equalsIgnoreCase(UserChoice.CHEAT.name())) {
				this.isCheated = true;
			}
		}
	}

}
