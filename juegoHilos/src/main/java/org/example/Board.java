package org.example;

import java.util.Random;

public class Board {
    static Ship ship;
    private static int boardSize;
    private static char[][] board;
    private static int targetRow, targetCol;

    public Board(int boardSize) {
        ship = new Ship(5);

        Board.boardSize = boardSize;
        board = new char[boardSize][boardSize];
    }

    public static void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '~'; // Agua
                ship.setMarked(false);
            }
        }
        targetRow = (new Random()).nextInt(boardSize);
        targetCol = (new Random()).nextInt(boardSize);
    }

    public static char[][] getBoard() {
        return board;
    }

    public static void setBoard(char[][] board) {
        Board.board = board;
    }

    public static int getTargetRow() {
        return targetRow;
    }

    public static void setTargetRow(int targetRow) {
        Board.targetRow = targetRow;
    }

    public static int getTargetCol() {
        return targetCol;
    }

    public static void setTargetCol(int targetCol) {
        Board.targetCol = targetCol;
    }
}
