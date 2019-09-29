package com.workshop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.workshop.constants.BotType;
import com.workshop.model.EvilBot;
import com.workshop.model.GameTornment;
import com.workshop.model.Player;
import com.workshop.operations.Game;

public class RunApplication {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Rounds : ");
		int numberOfRounds = Integer.parseInt(scanner.nextLine());
		List<Game> games = new LinkedList();
		List<Player> players = new ArrayList();
		players.add(new EvilBot(BotType.EVIL.name()));
		players.add(new EvilBot(BotType.COPYCAT.name()));
		Game game = new Game(numberOfRounds, players);
		games.add(game);

		GameTornment gameTornment = new GameTornment();
		System.out.println(gameTornment.playTorment(games));

		scanner.close();
	}

}
