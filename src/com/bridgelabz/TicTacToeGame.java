package com.bridgelabz;

public class TicTacToeGame {
        private char[] board;

        public static void main(String[] args) {
            TicTacToeGame ticTacToeGame = new TicTacToeGame();
            ticTacToeGame.createBoard();
        }

        private void createBoard() {
            this.board = new char[10];
            for (int i = 1; i < this.board.length; i++)
                this.board[i] = ' ';
        }
    }
