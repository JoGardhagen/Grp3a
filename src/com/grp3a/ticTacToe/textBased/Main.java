package com.grp3a.ticTacToe.textBased;

import java.util.*;

public class Main {
	/*
	 * Check Lista f�r arbetet :: // notera klar n�r klar. ? switch stat f�r
	 * aiRoll.: Jocke Fixar // Note Fixat // note Dubble fixad :) ? gameLoop f�r att
	 * f� spelet att forts�tta : Anna Fixar check// win or Lose logit: check// replay funk // 
	 * Anna- Nu kan man se vem som vinner/f�rlorar men inte om det blir oavgjort och man kan �ven forts�tta 
	 * skriva siffror allts� input fast spelet �r klart. 
	 * S� inte helt f�rdigt men t�nker att vi kikar det tillsammns!: Anna//
	 * 
	 * Ska vi dela upp det i olika klasser kanske? : Anna
	 * While loop f�r oneMoreGame yes or no : Anna
	 * 
	 */


	static char[][] playBoard = new char[3][3];
	static Scanner scan = new Scanner(System.in);
	static boolean oneMoreGame = true;
	static boolean gameOver = false;
	public static void main(String[] args) {
		System.out.println(" V�lkommen till Tic Tac Toe\n\t***\n Du �r spelare X!\n\t***");
		
		gameLoop();
		scan.close();
	}

	public static void gameLoop() { // Metod f�r SpelLoopen mellan X och O
		
		Random rand = new Random();
		
		while (oneMoreGame) {
			while (!gameOver) { 					// om spel �r klart s� hoppar programmet inte in i denna loop
						System.out.println(" Skriv in en position mellan (1 -9)\n\t***");
				int xCordinate = scan.nextInt(); 	// tar emot ett v�rde ist�llet f�r 2.
				XMove(xCordinate); 							// anropar XMove metod som omvandlar xCor till 2 v�rden och sl�nger in 'X' i   Playboard
				printGameBoard();							
				gameOver = isItOver(playBoard);				// Kontrollerar i loopen om Spelare vann /Anna
	
				int aIRoll = rand.nextInt(9) + 1;
				if (gameOver) {
					reboot();
				}
				System.out.println("\t***\nDatorns tur!\n\t***"); 	
				OMove(aIRoll);								// Datorns random drag
				printGameBoard();							// L�gger random drag p� spelplan och print ut
				gameOver = isItOver(playBoard);				// Kontrollerar i loopen om Dator vann /Anna
												
				// Just nu s� kan man fortfarande skriva siffror efter spelet �r slut M�STE KOLLA UPP DET /Anna
				if (gameOver) {
					
					reboot();
				}
			}
		}// slut vinge f�r inre While loop
			
		
		
	}
	public static void reboot() {
		// Kod nedan f�r g�r att man kan v�lja att avsluta spelet eller k�ra igen MEN Reset Gameboard funkar ej. Kollar det efter lunch.
					System.out.println("Vill du spela igen? J/N");
					scan.nextLine();
					String answer=scan.nextLine();
					
					switch(answer) {
					case"J":
					case "j":
						oneMoreGame = true;
					startOver(playBoard);
						gameOver = false;
						printGameBoard();
						break;
						
					case "N":
					case "n":
						oneMoreGame = false;
						System.out.println("Bye Bye");
						break;
						default:
							break;
					}
				}		// yttre while
	
	

// M�la ut spelplanen med hj�lp av en nestlad for-loop 3x3
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
	
	/* Denna metod g�r s� att spelbr�dan nollas och man kan b�rja om ett nytt spel /Anna/
	 * 
	* Kanske kan man g�ra en for loop som i "printGameBoard" metoden?
	* 
	*/
	public static void startOver(char [][]playBoard) {
		playBoard [0][0] = ' ';
		playBoard [0][1] = ' ';
		playBoard [0][2] = ' ';
		playBoard [1][0] = ' ';
		playBoard [1][1] = ' ';
		playBoard [1][2] = ' ';
		playBoard [2][0] = ' ';
		playBoard [2][1] = ' ';
		playBoard [2][2] = ' ';
		
		
	}

	public static char XMove(int xCor) {

		int row;
		int column;

		// switch sats som omvandlar det anv�ndaren skriver in till x o y koordinater
		switch (xCor) {
		case 1:
			row = 0;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F�rs�k igen\n");
			// Om anv�ndare eller Dator skriver samma ruta s� loopar spelPlanen och anv f�r
			// skriva igen
			gameLoop();

		case 2:
			row = 0;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F�rs�k igen ");

			gameLoop();

		case 3:
			row = 0;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F�rs�k igen ");

			gameLoop();

		case 4:
			row = 1;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F�rs�k igen ");

			gameLoop();
		case 5:
			row = 1;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F�rs�k igen ");

			gameLoop();

		case 6:
			row = 1;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F�rs�k igen ");

			gameLoop();
		case 7:
			row = 2;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F�rs�k igen ");

			gameLoop();
		case 8:
			row = 2;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F�rs�k igen ");

			gameLoop();
		case 9:
			row = 2;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F�rs�k igen ");

			gameLoop();
		}
		return 0;

	}

	public static char OMove(int aIRoll) {
		int row;
		int column;

		// switch sats som omvandlar det anv�ndaren skriver in till x o y koordinater
		switch (aIRoll) {
		case 1:
			row = 0;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}
			// else System.out.println(" Ivalid Move");

		case 2:
			row = 0;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}
			// else System.out.println(" Ivalid Move");

		case 3:
			row = 0;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}
			// else System.out.println(" Ivalid Move");
		case 4:
			row = 1;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}
			// else System.out.println(" Ivalid Move");

		case 5:
			row = 1;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}
			// else System.out.println(" Ivalid Move");
		case 6:
			row = 1;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}
			// else System.out.println(" Ivalid Move");

		case 7:
			row = 2;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}
			// else System.out.println(" Ivalid Move");
		case 8:
			row = 2;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}
			// else System.out.println(" Ivalid Move");

		case 9:
			row = 2;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}
			// else System.out.println(" Ivalid Move");

		}
		return 0;

	}

	// 	isItOver metod f�r att kolla om Player X eller Datorn O vann. 
	//	H�gst oklart varf�r den inte funkar helt men det �r inte l�ngt ifr�n...
	
public static boolean isItOver(char [][] playBoard) {

		// V�gr�tt r�ttning f�r X och O
		if (playBoard[0][0] == 'X' && playBoard[0][1] == 'X' && playBoard[0][2]=='X') {
		System.out.println("\nGRATTIS Du vann!");
	return true;
	}	if (playBoard[0][0] == 'O' && playBoard[0][1] == 'O' && playBoard[0][2]=='O') {
		System.out.println("Datorn vann!");
	return true;
	
	}	if (playBoard[1][0] == 'X' && playBoard[1][1] == 'X' && playBoard[1][2]=='X') {
		System.out.println("\nGRATTIS Du vann!");
	return true;
	}	if (playBoard[1][0] == 'O' && playBoard[1][1] == 'O' && playBoard[1][2]=='O') {
		System.out.println("Datorn vann!");
	return true;
	
	}	if (playBoard[2][0] == 'X' && playBoard[2][1] == 'X' && playBoard[2][2]=='X') {
		System.out.println("\nGRATTIS Du vann!");
	return true;
	}	if (playBoard[2][0] == 'O' && playBoard[2][1] == 'O' && playBoard[2][2]=='O') {
		System.out.println("Datorn vann!");
	return true;
	
	}	// Lodr�tt r�ttning f�r X och O
		if (playBoard[0][0] == 'X' && playBoard[1][0] == 'X' && playBoard[2][0]=='X') {
			System.out.println("\nGRATTIS Du vann!");
	return true;
	}	
		if (playBoard[0][0] == 'O' && playBoard[1][0] == 'O' && playBoard[2][0]=='O') {
		System.out.println("Datorn vann!");
	return true;
	}	
		if (playBoard[0][1] == 'X' && playBoard[1][1] == 'X' && playBoard[2][1]=='X') {
			System.out.println("\nGRATTIS Du vann!");
	return true;
	}	
		if (playBoard[0][1] == 'O' && playBoard[1][1] == 'O' && playBoard[2][1]=='O') {
		System.out.println("Datorn vann!");
	return true;
	}
		if (playBoard[0][2] == 'X' && playBoard[1][2] == 'X' && playBoard[2][2]=='X') {
			System.out.println("\nGRATTIS Du vann!");
	return true;
	}
		if (playBoard[0][2] == 'O' && playBoard[1][2] == 'O' && playBoard[2][2]=='O') {
		System.out.println("Datorn vann!");
	return true;
	} 		
		// Diagonal r�ttning f�r X och O
		if (playBoard[0][0] == 'X' && playBoard[1][1] == 'X' && playBoard[2][2]=='X') {
			System.out.println("\nGRATTIS Du vann!");
	return true;
	}	
		if (playBoard[0][0] == 'O' && playBoard[1][1] == 'O' && playBoard[2][2]=='O') {
		System.out.println("Datorn vann!");
	return true;
	}	
		if (playBoard[2][0] == 'X' && playBoard[1][1] == 'X' && playBoard[0][2]=='X') {
			System.out.println("\nGRATTIS Du vann!");
	return true;
	}	
		if (playBoard[2][0] == 'O' && playBoard[1][1] == 'O' && playBoard[0][2]=='O') {
		System.out.println("Datorn vann!");
	return true;
	}
//		//	Detta ska se ifall det blev lika MEN den g�r s� att alla drag blir " Oavgjort " :)))
//		else if	(playBoard[0][0] != 'X' && playBoard[0][1] != 'X' && playBoard[0][2] != 'X' 
//			&& playBoard[1][0] != 'X' && playBoard[1][1] != 'X' && playBoard[1][2] != 'X' 
//			&& playBoard[2][0] != 'X' && playBoard[2][1] != 'X' && playBoard[2][2] != 'X') {
//			System.out.println("Det blev oavgjort!!");
//			return true;
//		} 	

	return false;
	}
}
