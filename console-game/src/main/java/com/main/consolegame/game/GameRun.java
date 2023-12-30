package com.main.consolegame.game;

public class GameRun {
	GamingConsole gamingConsole;
	
//	public GameRun(MapleStoty mapleStory) {
//		this.mapleStory = mapleStory;
//	}
	public GameRun(GamingConsole gamingConsole) {
		this.gamingConsole = gamingConsole;
	}

	public void run() {
//		System.out.println("Game is Running... : " + mapleStory);
//		mapleStory.up();
//		mapleStory.down();
//		mapleStory.left();
//		mapleStory.right();
		
		System.out.println("Game is Running... : " + gamingConsole);
		gamingConsole.up();
		gamingConsole.down();
		gamingConsole.left();
		gamingConsole.right();
	}

}
