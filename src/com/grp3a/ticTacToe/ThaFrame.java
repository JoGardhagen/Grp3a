package com.grp3a.ticTacToe;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//I stort s�tt samma som innan men Construktas fr�n sin egen Class
public class ThaFrame extends JFrame implements ActionListener{
	
	JButton button;// knapp
	
	ThaFrame() {
		
		button = new JButton();
		button.setBounds(100, 100, 100, 100);
		button.addActionListener(this);
		button.setText("Btn 1");
		button.setFocusable(false);
		
		this.setTitle("Tic-Tac-Toe :  Grp3a.");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);// f�rnster storlek
		this.setVisible(true);
		this.add(button);
	}
	// vad som h�nder n�r man trycker p� knappen i nul�get inget mer en skriver ut 
	// Test i konsolen
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("test");
		}
		
	}
}
