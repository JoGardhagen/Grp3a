package com.grp3a.ticTacToe;

//sida 376
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//I stort s�tt samma som innan men Construktas fr�n sin egen Class
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
		this.setSize(500, 500);// f�rnster storlek
		this.getContentPane().setBackground(Color.RED);//Ny F�rg R�d :) 
		this.setVisible(true);
		this.add(button);
		this.add(button2);
		this.add(button3);
	}
	// vad som h�nder n�r man trycker p� knappen i nul�get inget mer en skriver ut 
	// Test i konsolen
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("test");
			button.setText("x");// �ndrar texten till ett kryss ist�llt 
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
