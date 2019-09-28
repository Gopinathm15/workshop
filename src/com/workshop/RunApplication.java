package com.workshop;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.workshop.constants.BotType;
import com.workshop.model.CopyCatBot;
import com.workshop.model.Player;
import com.workshop.operations.Game;

public class RunApplication {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Rounds : ");
		int numberOfRounds = Integer.parseInt(scanner.nextLine());
		Game playerService = new Game();
		List<Player> players = new LinkedList();
		players.add(new Player("ram"));
		Player evil = new CopyCatBot(BotType.COPYCAT.name());
		players.add(evil);
		playerService.play(numberOfRounds, players).forEach(player -> {
			System.out.println("Player Name : " + player.getName());
			System.out.println("Player Score : " + player.getScore());
		});
		scanner.close();
	}

}
