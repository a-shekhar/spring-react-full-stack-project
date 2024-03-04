package com.example.loosecoupling;


import com.example.loosecoupling.game.GameRunner;
import com.example.loosecoupling.game.MarioGame;
import com.example.loosecoupling.game.PacmanGame;
import com.example.loosecoupling.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {
       // var game = new MarioGame();
      //  var game  = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
