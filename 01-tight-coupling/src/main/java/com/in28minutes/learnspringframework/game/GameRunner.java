package com.in28minutes.learnspringframework.game;

public class GameRunner {
    // MarioGame game;
    SuperContraGame game;

    public GameRunner(SuperContraGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
