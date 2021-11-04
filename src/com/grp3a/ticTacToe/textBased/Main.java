package com.grp3a.ticTacToe.textBased;

import java.util.*;

public class Main {
	/*
	 * Check Lista för arbetet :: // notera klar när klar. ? switch stat för
	 * aiRoll.: Jocke Fixar // Note Fixat // note Dubble fixad :) ? gameLoop för att
	 * få spelet att fortsätta : Anna Fixar check// win or Lose logit: check// replay funk // 
	 * Anna- Nu kan man se vem som vinner/förlorar men inte om det blir oavgjort och man kan även fortsätta 
	 * skriva siffror alltså input fast spelet är klart. 
	 * Så inte helt färdigt men tänker att vi kikar det tillsammns!: Anna//
	 * 
	 * Ska vi dela upp det i olika klasser kanske? : Anna
	 * While loop för oneMoreGame yes or no : Anna
	 * 
	 */


	static char[][] playBoard = new char[3][3];
	static Scanner scan = new Scanner(System.in);
	static boolean oneMoreGame = true;
	static boolean gameOver = false;
	public static void main(String[] args) {
		System.out.println(" Välkommen till Tic Tac Toe\n\t***\n Du är spelare X!\n\t***");
		
		gameLoop();
		scan.close();
	}

	public static void gameLoop() { // Metod för SpelLoopen mellan X och O
		
		Random rand = new Random();
		
		while (oneMoreGame) {
			while (!gameOver) { 					// om spel är klart så hoppar programmet inte in i denna loop
						System.out.println(" Skriv in en position mellan (1 -9)\n\t***");
				int xCordinate = scan.nextInt(); 	// tar emot ett värde istället för 2.
				XMove(xCordinate); 							// anropar XMove metod som omvandlar xCor till 2 värden och slänger in 'X' i   Playboard
				printGameBoard();							
				gameOver = isItOver(playBoard);				// Kontrollerar i loopen om Spelare vann /Anna
	
				int aIRoll = rand.nextInt(9) + 1;
				if (gameOver) {
					reboot();
				}
				System.out.println("\t***\nDatorns tur!\n\t***"); 	
				OMove(aIRoll);								// Datorns random drag
				printGameBoard();							// Lägger random drag på spelplan och print ut
				gameOver = isItOver(playBoard);				// Kontrollerar i loopen om Dator vann /Anna
												
				// Just nu så kan man fortfarande skriva siffror efter spelet är slut MÅSTE KOLLA UPP DET /Anna
				if (gameOver) {
					
					reboot();
				}
			}
		}// slut vinge för inre While loop
			
		
		
	}
	public static void reboot() {
		// Kod nedan för gör att man kan välja att avsluta spelet eller köra igen MEN Reset Gameboard funkar ej. Kollar det efter lunch.
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
	
	/* Denna metod gör så att spelbrädan nollas och man kan börja om ett nytt spel /Anna/
	 * 
	* Kanske kan man göra en for loop som i "printGameBoard" metoden?
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

		// switch sats som omvandlar det användaren skriver in till x o y koordinater
		switch (xCor) {
		case 1:
			row = 0;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, Försök igen\n");
			// Om användare eller Dator skriver samma ruta så loopar spelPlanen och anv får
			// skriva igen
			gameLoop();

		case 2:
			row = 0;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, Försök igen ");

			gameLoop();

		case 3:
			row = 0;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, Försök igen ");

			gameLoop();

		case 4:
			row = 1;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, Försök igen ");

			gameLoop();
		case 5:
			row = 1;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, Försök igen ");

			gameLoop();

		case 6:
			row = 1;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, Försök igen ");

			gameLoop();
		case 7:
			row = 2;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, Försök igen ");

			gameLoop();
		case 8:
			row = 2;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, Försök igen ");

			gameLoop();
		case 9:
			row = 2;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, Försök igen ");

			gameLoop();
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

	// 	isItOver metod för att kolla om Player X eller Datorn O vann. 
	//	Högst oklart varför den inte funkar helt men det är inte långt ifrån...
	
public static boolean isItOver(char [][] playBoard) {

		// Vågrätt rättning för X och O
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
	
	}	// Lodrätt rättning för X och O
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
		// Diagonal rättning för X och O
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
//		//	Detta ska se ifall det blev lika MEN den gör så att alla drag blir " Oavgjort " :)))
//		else if	(playBoard[0][0] != 'X' && playBoard[0][1] != 'X' && playBoard[0][2] != 'X' 
//			&& playBoard[1][0] != 'X' && playBoard[1][1] != 'X' && playBoard[1][2] != 'X' 
//			&& playBoard[2][0] != 'X' && playBoard[2][1] != 'X' && playBoard[2][2] != 'X') {
//			System.out.println("Det blev oavgjort!!");
//			return true;
//		} 	

	return false;
	}
}
