package com.workshop.constants;

public enum UserChoice {

	COOPERATE(1), CHEAT(-1);

	int score;

	UserChoice(int score) {
		this.score = score;
	}

	public int getValue() {
		return score;
	}

}
