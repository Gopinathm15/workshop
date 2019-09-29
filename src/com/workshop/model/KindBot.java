package com.workshop.model;

import com.workshop.constants.UserChoice;

public class KindBot extends Player {

	public KindBot(String type) {
		super(type);
	}

	@Override
	public String getChoice() {
		return super.getChoice();
	}

	@Override
	public void pickChoice() {
		super.setChoice(UserChoice.COOPERATE.name());
	}
}
