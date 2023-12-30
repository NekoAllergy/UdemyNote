package com.main.consolegame;

import com.main.consolegame.game.MapleStoty;
import com.main.consolegame.game.MineCraft;
import com.main.consolegame.game.SlenderMan;
import com.main.consolegame.game.GameRun;
import com.main.consolegame.game.GamingConsole;

public class App01GameStarting {

	public static void main(String[] args) {
		
		MapleStoty game = new MapleStoty();
//		MineCraft game = new MineCraft();
//		SlenderMan game = new SlenderMan();
		
		GameRun gameRun = new GameRun(game);
		
		
		gameRun.run();
	}

}
