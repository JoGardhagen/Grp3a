package com.grp3a.ticTacToe;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// main classen
		// nytt fr�n nu : ) 
//		
//		JFrame frame = new JFrame();
//		frame.setSize(300,400);
//		frame.setTitle("Tic-Tac-Toe : Grp3a");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
//		//frame.(Color.red);
//		//frame.setBackground(Color.red);
//		JPanel prim = new JPanel();
//		prim.setBackground(Color.red);
//		prim.setVisible(true);
//		
///////////////////////////////////Id� att vi ska g�r GUI L�sning////////////////////////////////
		
		
		JFrame frame = new JFrame("V�lkommen");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel primary = new JPanel();
		primary.setBackground(Color.red);
		primary.setPreferredSize(new Dimension(500,500));
		
		frame.getContentPane().add(primary);
		frame.pack();// viktig
		frame.setVisible(true);// viktig
/////////////////////////////////////////////////////////////////////////////////////////////////		
		
	}

}
