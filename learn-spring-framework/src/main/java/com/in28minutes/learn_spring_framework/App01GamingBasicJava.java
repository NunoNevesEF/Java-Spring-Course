package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var marioGame = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
