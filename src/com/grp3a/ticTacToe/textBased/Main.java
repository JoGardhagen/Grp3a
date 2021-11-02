package com.grp3a.ticTacToe.textBased;

import java.util.*;

public class Main {
//    ||
//    ||
//     | |

    static char [][] playBoard = new char [3][3];
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
    	
    Random rand= new Random();
    System.out.println("skriv koordinater För 'X' 1 till 9");
    
    int xCor =scan.nextInt();// tar emot ett värde istället för 2. 
    int row;
	int column;
	
	//switch sats som omvandlar det användaren skriver in till x o y koordinater 
    switch(xCor) {
	   case 1:  row = 0; 
	   		column=0;
	   		playBoard[row][column]= 'X';
	   		break;
	   case 2:  row = 0; 
			column=1;
			playBoard[row][column]= 'X';
			break;
	   case 3 :  row = 0; 
			column=2;
			playBoard[row][column]= 'X';
			break;	
	   case 4:  row = 1; 
			column=0;
			playBoard[row][column]= 'X';
			break;
	   case 5:  row = 1; 
			column=1;
			playBoard[row][column]= 'X';
			break;
	   case 6:  row = 1; 
			column=2;
			playBoard[row][column]= 'X';
			break;
	   case 7:  row = 2; 
			column=0;
			playBoard[row][column]= 'X';
			break;
	   case 8:  row = 2; 
			column=1;
			playBoard[row][column]= 'X';
			break;
	   case 9:  row = 2; 
			column=2;
			playBoard[row][column]= 'X';
			break;
	   }

    //playBoard[row][column]= 'X';
    
   // playBoard[row][column]= 'X';
    
    printGameBoard();
    int airoll=rand.nextInt(2);
    playBoard[airoll][airoll]='O';
    printGameBoard();
    scan.close();
    }
// Måla ut spelplanen med hjälp av en nestlad for-loop 3x3
    public static void printGameBoard() {
    System.out.println("");
    for(int rad =0; rad<3;rad++) {
        for(int pel=0;pel<3;pel++) {

            System.out.print("["+playBoard[rad][pel] + "]"+rad+","+pel);
        }
    System.out.println();
        }
    }
   
}

