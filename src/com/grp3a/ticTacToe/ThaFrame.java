package com.grp3a.ticTacToe;

//sida 376
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//I stort sätt samma som innan men Construktas från sin egen Class
public class ThaFrame extends JFrame implements ActionListener{
	
	JButton button;// knapp
	JButton button2;
	JButton button3;
	ThaFrame() {
		
		button = new JButton("1");
		button.setBounds(100, 100, 100, 100);
		button.addActionListener(this);
		//button.setText("Btn 1");
		button.setFocusable(false);
		button2 = new JButton("2");
		button2.setBounds(200, 100, 100, 100);
		button2.addActionListener(this);
		//button.setText("Btn 1");
		button3 = new JButton("3");
		button3.setBounds(300, 100, 100, 100);
		button3.addActionListener(this);
		//button.setText("Btn 1");
		button3.setFocusable(false);
		
		
		this.setTitle("Tic-Tac-Toe :  Grp3a.");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);// förnster storlek
		this.getContentPane().setBackground(Color.RED);//Ny Färg Röd :) 
		this.setVisible(true);
		this.add(button);
		this.add(button2);
		this.add(button3);
	}
	// vad som händer när man trycker på knappen i nuläget inget mer en skriver ut 
	// Test i konsolen
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("test");
			button.setText("x");// ändrar texten till ett kryss iställt 
		}
		if(e.getSource()==button2) {
			System.out.println("test2");
			button2.setText("x");
		}
		if(e.getSource()==button3) {
			System.out.println("test3");
			button3.setText("x");
		}
	}
}
