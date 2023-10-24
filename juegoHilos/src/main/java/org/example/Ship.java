package org.example;

public class Ship {
    private static boolean[][] marked;

    public Ship(int boardSize) {
        marked = new boolean[boardSize][boardSize];
    }

    public static boolean[][] getMarked() {
        return marked;
    }

    public static void setMarked(boolean[][] marked) {
        Ship.marked = marked;
    }
}
