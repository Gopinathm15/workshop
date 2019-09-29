package com.workshop.model;

import com.workshop.constants.UserChoice;

public class EvilBot extends Player {

	public EvilBot(String type) {
		super(type);
	}

	@Override
	public String getChoice() {
		return super.getChoice();
	}

	@Override
	public void pickChoice() {
		super.setChoice(UserChoice.CHEAT.name());
	}

}
