
package com.grp3a.ticTacToe.textBased;

import java.util.*;

public class Main {
	/*	Det har varit mycket roligt och l?rorikt uppgift 
	 * 
	 * Joakim : sammarbetet har gett mig en syn till att bara f?r att det k?nns logiskt i mitt 
	 * huvud ?r som sagt inte dirket f?rklarligt f?r mina Comrades(Kamrater).GitHub var klurigt f?rst men nu efter en tid b?rjar jag f?rst?
	 * lite hur det fungerar.Det finns mkt mer i detta projekt jag hade velat g?ra men tiden r?ckte inte riktigt till 
	 * och det ?r dags att avsluta. Det stora hela jag har l?rt mig med denna uppgift ?r att f?rs?ka strukurera 
	 * arbetet tidigt ist?llt f?r att kasta sig in i arbetet ist?llet f?r att ta tag i strukturen 
	 * n?r problemen uppst?r..... :) 
	 * 
	 * Andom jag har inte skrivit s? mycket har mest kommit lite med f?rslag och l?rt mig en massa.
	 * Jag f?rs?kte l?gga in en else sats f?r att ai buggade, det fixa ej  problemet, det k?nns som det ska va d?r ist?llet f?r return elr en
	 * do-loop, men men.
	 * 
	 * ----		
	 * -Annas tankar och l?rdom under Grupparbetet-
	 * Har l?rt mig mycket mer om olika metoder, mer om olika loopar, anv?ndning utav switch satser 
	 * och om man s?tter static Scanner t.ex h?gst upp s? n?r alla metoder det! Kul hade ingen aning.
	 * Med tanke p? att vi sadlade om i uppgiften s? tycker jag att v?ran grupp har presterat j?kligt bra p? den tid som fanns ?ver!
	 * 
	 * Vi har st?tt p? lite olika hinder s?klart men tillsammans l?st det s? gott vi kunnat.
	 * Det jag ?nska vi hade hunnit med ?r att peta in en try catch/Exception av n?got slag kanske
	 * d? saker kan g? fel, men vi har r?knat med att Anv?ndaren sk?ter sig exemplariskt!
	 * Samt andra sm? fix saker Men vi har ett fungerande spel (ish) som talar om vem som vinner :D S? det ?r ju bra.
	 * GitHub var/ ?r lite br?kig men vi f?r till det till och fr?n !
	 */

// globala Variabler , deklarerade h?r f?r 
	static char[][] playBoard = new char[3][3]; 
	static Scanner scan = new Scanner(System.in);
	static boolean oneMoreGame = true;
	static boolean gameOver = false;
	public static void main(String[] args) {
		System.out.println(" V?lkommen till Tic Tac Toe\n\t***\n Du ?r spelare X!\n\t***");
		
		gameLoop();
		scan.close();
	}

	public static void gameLoop() { // Metod f?r SpelLoopen mellan X och O
		
		Random rand = new Random();
	
		while (oneMoreGame) {
			while (!gameOver) { 					// om spel ?r klart s? hoppar programmet inte in i denna loop
						System.out.println(" Skriv in en position mellan (1 -9)\n\t***");
				int xCordinate = scan.nextInt(); 	// tar emot ett v?rde ist?llet f?r 2.
				XMove(xCordinate); 							// anropar XMove metod som omvandlar xCor till 2 v?rden och sl?nger in 'X' i   Playboard
				printGameBoard();							
				gameOver = isItOver(playBoard);				// Kontrollerar i loopen om Spelare vann /Anna
	
				int aIRoll = rand.nextInt(9) + 1;
				if (gameOver) {
					
				}
				System.out.println("\t***\nDatorns tur!\n\t***"); 	
				OMove(aIRoll);								// Datorns random drag
				printGameBoard();							// L?gger random drag p? spelplan och print ut
				gameOver = isItOver(playBoard);				// Kontrollerar i loopen om Dator vann 
												
				
				if (gameOver) {
					reboot();		// L?ter anv?ndaren v?lja ny omg?ng eller avsluta spelet.
				}
			}	// slutvinge f?r inre While loop
		}		// slutvinge f?r yttre While loop
			
		
		
	}
	public static void reboot() {
		// Kod nedan f?r g?r att man kan v?lja att spela igen eller avsluta.
					System.out.println("Vill du spela igen? J/N");
					scan.nextLine();
					String answer=scan.nextLine();
					
					switch(answer.toUpperCase()) {// omformaterar input till stora bokst?ver.
					case"J":
						oneMoreGame = true;
					startOver(playBoard);
						gameOver = false;
						printGameBoard();
						break;
						
					case "N":
						oneMoreGame = false;						// Avslutar spelet.
						System.out.println("Tack f?r en god match!");
						break;
						default:
							break;
					}
				}		
	
	

// M?la ut spelplanen med hj?lp av en nestlad for-loop 3x3
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
	
	// Denna metod g?r s? att spelbr?dan nollas och man kan b?rja om ett nytt spel. Datorn B?rjar vid n?sta omg?ng.
	// Nollst?ller spelbr?det.
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

		// switch sats som omvandlar det anv?ndaren skriver in till x o y koordinater
		switch (xCor) {
		case 1:					
			row = 0;
			column = 0;
			//Om Array elementet f?r index Row , Column inte ?r lika med X eller O
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';// Om element f?r index var blankt Skriv in X.
			} else
				System.out.println("Ruta upptagen, F?rs?k igen\n");
			
			gameLoop();// Om anv?ndare eller Dator skriver samma ruta s? hoppar man tillbaka till gameLoop och anv f?r skriva ett nytt v?rde.

		case 2:
			row = 0;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F?rs?k igen\n");

			gameLoop();

		case 3:
			row = 0;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F?rs?k igen\n");

			gameLoop();

		case 4:
			row = 1;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F?rs?k igen\n");

			gameLoop();
		case 5:
			row = 1;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F?rs?k igen\n");

			gameLoop();

		case 6:
			row = 1;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F?rs?k igen\n");

			gameLoop();
		case 7:
			row = 2;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F?rs?k igen\n");

			gameLoop();
		case 8:
			row = 2;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F?rs?k igen\n");

			gameLoop();
		case 9:
			row = 2;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'X';
			} else
				System.out.println("Ruta upptagen, F?rs?k igen\n");

			gameLoop();
		}
		return 0;
	}

	public static char OMove(int aIRoll) {
		int row;
		int column;
	
		// switch sats som omvandlar det anv?ndaren skriver in till x o y koordinater
		switch (aIRoll) {
		case 1:
			row = 0;
			column = 0;
			//Om Array elementet f?r index Row , Column inte ?r lika med X eller O
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}


		case 2:
			row = 0;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}

			
		case 3:
			row = 0;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}

			
		case 4:
			row = 1;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}


		case 5:
			row = 1;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}

			
		case 6:
			row = 1;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}


		case 7:
			row = 2;
			column = 0;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}

			
		case 8:
			row = 2;
			column = 1;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}


		case 9:
			row = 2;
			column = 2;
			if (playBoard[row][column] != 'X' && playBoard[row][column] != 'O') {
				return playBoard[row][column] = 'O';
			}


		}
		return 0;

	}

	// 	isItOver metod f?r att kolla om Player X eller Datorn O vann. 
	
public static boolean isItOver(char [][] playBoard) {

		// V?gr?tt r?ttning f?r X och O
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
	
	}	// Lodr?tt r?ttning f?r X och O
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
		// Diagonal r?ttning f?r X och O
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
		
		// vi hade en arbetsHypot?s f?r att l?sa Oavgjort
		// finns m?nga id?er p? ritbordet men vi har tyv?r inte lyckats med n?got ?n. . . 
//		//	Detta ska se ifall det blev lika MEN den g?r s? att alla drag blir " Oavgjort " :)))
//		else if	(playBoard[0][0] != 'X' && playBoard[0][1] != 'X' && playBoard[0][2] != 'X' 
//			&& playBoard[1][0] != 'X' && playBoard[1][1] != 'X' && playBoard[1][2] != 'X' 
//			&& playBoard[2][0] != 'X' && playBoard[2][1] != 'X' && playBoard[2][2] != 'X') {
//			System.out.println("Det blev oavgjort!!");
//			return true;
//		} 	

	return false;
	}
}
