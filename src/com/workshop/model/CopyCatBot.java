package com.workshop.model;

import com.workshop.constants.UserChoice;

public class CopyCatBot extends Player {

	public CopyCatBot(String type) {
		super(type);
	}

	public void setPreChoice(String preChoice) {
		super.setChoice(preChoice);
	}

	@Override
	public void pickChoice() {
		if (super.getChoice() == null) {
			super.setChoice(UserChoice.COOPERATE.name());
		}
	}

}
