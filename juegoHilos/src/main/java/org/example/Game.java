package org.example;

public class Game {
    private static boolean gameOver = false;
    public Game() {}

    public static boolean isGameOver() {
        return gameOver;
    }

    public static void setGameOver(boolean gameOver) {
        Game.gameOver = gameOver;
    }
}
