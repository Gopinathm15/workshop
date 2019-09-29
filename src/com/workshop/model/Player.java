package com.workshop.model;

import com.workshop.utils.GameChoiceUtils;

public class Player {

	private String name;
	private int score;
	private String choice;

	public Player(String name) {
		this.name = name;
		this.score = 0;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void addScore(int score) {
		this.score += score;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public void pickChoice() {
		this.choice = GameChoiceUtils.getHumanRamdomChoice();
	}

	public void holdPlayerChoice(String playerChoice) {

	}

}
