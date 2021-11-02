package com.grp3a.ticTacToe.textBased;

import java.util.*;

public class Main {
//    ||
//    ||
//     | |

    static char [][] playBoard = new char [3][3];

    public static void main(String[] args) {
    	Random rand= new Random();
    	Scanner scan = new Scanner(System.in);
    
    
    int row =scan.nextInt();
    int column =scan.nextInt();

    playBoard[row][column]= 'X';
    
    printGameBoard();
    int airoll=rand.nextInt(2);
    playBoard[airoll][airoll]='O';
    printGameBoard();
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

