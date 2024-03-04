package com.example.loosecoupling;


import com.example.loosecoupling.game.GameRunner;
import com.example.loosecoupling.game.MarioGame;
import com.example.loosecoupling.game.PacmanGame;
import com.example.loosecoupling.game.SuperContraGame;

public class App01GamingBasic {
    public static void main(String[] args) {
       // var game = new MarioGame();
      //  var game  = new SuperContraGame();
        var game = new PacmanGame(); // 1. object creation
        var gameRunner = new GameRunner(game); // 2 : Object creation + Wiring of dependecy
                            // Game is dependency
        gameRunner.run();
    }
}
