package com.bridgelabz;

public class Tic_Tac_Toe {

    static void printBoard() {
            char Board[] = new char[10];    //Create an array that represents our tic tac toe board to display

            for (int i = 0; i < 10; i++) {           //Initialize  board with dashes
                for (int j = 0; j < 10; j++) {
                    Board[i] = '-';
                }
            }

        }
    public static void main(String[] args) {
        System.out.println("Play the game");
        printBoard();

    }
}