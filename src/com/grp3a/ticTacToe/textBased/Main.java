package com.grp3a.ticTacToe.textBased;

import java.util.*;

public class Main {
	/*
	 * Check Lista för arbetet :: // notera klar när klar. ? switch stat för aiRoll.
	 * : Jocke Fixar // Note Fixat ? gameLoop för att få spelet att fortsätta : Anna
	 * Fixar ? win or Lose logit. ? replay funk
	 * 
	 * 
	 * 
	 */
//    ||
//     | |

	static char[][] playBoard = new char[3][3];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		
		gameLoop();
		printGameBoard();
	
		scan.close();
	}

	public static void gameLoop() {							//Metod för SpelLoopen mellan X och O 
		boolean oneMoreGame = true;
		boolean gameOver = false;
		Random rand = new Random();
		
		while (oneMoreGame) {
			while (!gameOver) { 					// om spel är klart så hoppar programmet inte in i denna loop
				System.out.println("skriv koordinater För 'X' 1 till 9");
				int xCordinate = scan.nextInt();// tar emot ett värde istället för 2.
				XMove(xCordinate);// anropar XMove metod som omvandlar xCor till 2 värden och slänger in 'X' i
				// Playboard
				printGameBoard();
				System.out.println("Computer 'O'");
				int aIRoll = rand.nextInt(9);
				OMove(aIRoll);
				// playBoard[airoll][airoll] = 'O';
				printGameBoard();
				if (gameOver) {
					break;
				}
			}
		}
	}

// Måla ut spelplanen med hjälp av en nestlad for-loop 3x3
	public static void printGameBoard() {
		// System.out.println("");
		for (int rad = 0; rad < 3; rad++) {
			for (int pel = 0; pel < 3; pel++) {

				// System.out.print("[" + playBoard[rad][pel] + "]" + rad + "," + pel);
				System.out.print("[" + playBoard[rad][pel] + "]");// som innan fast visar inte x o y Korrdinaterna
			}
			System.out.println();
		}
	}

	public static char XMove(int xCor) {

		int row;
		int column;

		// switch sats som omvandlar det användaren skriver in till x o y koordinater
		switch (xCor) {
		case 1:
			row = 0;
			column = 0;
			return playBoard[row][column] = 'X';

		case 2:
			row = 0;
			column = 1;
			return playBoard[row][column] = 'X';

		case 3:
			row = 0;
			column = 2;
			return playBoard[row][column] = 'X';

		case 4:
			row = 1;
			column = 0;
			return playBoard[row][column] = 'X';

		case 5:
			row = 1;
			column = 1;
			return playBoard[row][column] = 'X';

		case 6:
			row = 1;
			column = 2;
			return playBoard[row][column] = 'X';

		case 7:
			row = 2;
			column = 0;
			return playBoard[row][column] = 'X';

		case 8:
			row = 2;
			column = 1;
			return playBoard[row][column] = 'X';

		case 9:
			row = 2;
			column = 2;
			return playBoard[row][column] = 'X';

		}
		return 0;

	}

	public static char OMove(int aIRoll) {
		int row;
		int column;

		// switch sats som omvandlar det användaren skriver in till x o y koordinater
		switch (aIRoll) {
		case 1:
			row = 0;
			column = 0;
			return playBoard[row][column] = 'O';

		case 2:
			row = 0;
			column = 1;
			return playBoard[row][column] = 'O';

		case 3:
			row = 0;
			column = 2;
			return playBoard[row][column] = 'O';

		case 4:
			row = 1;
			column = 0;
			return playBoard[row][column] = 'O';

		case 5:
			row = 1;
			column = 1;
			return playBoard[row][column] = 'O';

		case 6:
			row = 1;
			column = 2;
			return playBoard[row][column] = 'O';

		case 7:
			row = 2;
			column = 0;
			return playBoard[row][column] = 'O';

		case 8:
			row = 2;
			column = 1;
			return playBoard[row][column] = 'O';

		case 9:
			row = 2;
			column = 2;
			return playBoard[row][column] = 'O';

		}
		return 0;

	}

}
