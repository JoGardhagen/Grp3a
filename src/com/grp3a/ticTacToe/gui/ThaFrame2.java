package com.grp3a.ticTacToe.gui;

import java.awt.BorderLayout;
//sida 376
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//I stort s�tt samma som innan men Construktas fr�n sin egen Class

@SuppressWarnings("Vet inte va detta �r ...")
public class ThaFrame2 extends JFrame implements ActionListener {

	JButton[] button = new JButton[9];// f�r nya Knappar
	JPanel buttonsPanel = new JPanel();// Panel f�r nya knappar
	JFrame frame = new JFrame();
	JLabel lable = new JLabel();
	JPanel topPanel = new JPanel();
	boolean cross;//bools variable f�r 'X'
	Random rand = new Random();
	JButton resetButton = new JButton(); // resetKnapp f�r att resetta skiten
	
	
	ThaFrame2() {
		
		buttonsPanel.setLayout(new GridLayout(3, 3));
		buttonsPanel.setPreferredSize(new Dimension(300, 300));
		// for loop f�r att st�lla upp 9 knappar
		for (int i = 0; i < 9; i++) {
			button[i] = new JButton();
			buttonsPanel.add(button[i]);
			button[i].addActionListener(this);
			button[i].setText("");
		}
		topPanel.setLayout(new BorderLayout());// borderLayout f�r topPanelen
		lable.setBackground(Color.ORANGE);
		lable.setText("Test Lable");
		topPanel.add(lable,BorderLayout.WEST);// s�tter test Lable till v�nster 
		
		topPanel.setPreferredSize(new Dimension(10, 50));
		topPanel.setBackground(Color.ORANGE);
		
		resetButton.setPreferredSize(new Dimension(100,40));// dimension f�r knappen
		resetButton.setText("Reset");// texten som st�r p� knappen
		resetButton.addActionListener(this);
		topPanel.add(resetButton,BorderLayout.EAST); // s�tter ResetKnappen till h�ger .

		frame.setTitle("Tic-Tac-Toe :  Grp3a.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(500, 500);// f�rnster storlek
		frame.getContentPane().setBackground(Color.RED);// Ny F�rg R�d :)
		frame.setBounds(300, 300, 500, 500);// f�nstret ploppar upp n�rmre mitten ist�llet f�r i h�rnen n�r man har "0,0"
		frame.add(buttonsPanel, BorderLayout.CENTER);// paneler g�r det m�jligt att l�gga saker var man vill :)
		frame.add(topPanel, BorderLayout.NORTH);
		frame.setVisible(true);

	
	}
	// vad som h�nder n�r man trycker p� knappen i nul�get inget mer en skriver ut
	// Test i konsolen
	// �ndrar nu Tecken till Kryss
	@Override
	public void actionPerformed(ActionEvent e) {// ny listener f�r nya knapparna
		for (int i = 0; i < 9; i++) {
			if (e.getSource() == button[i]) {
				if (cross) {//n�r true �r det 'O' tur, 
					//AiRoll();
//					int aiRoll = rand.nextInt(8);// generar ett slumptal 
//					if (button[aiRoll].getText() == "") {// kastar in talet som index i arrayenn ser om elementet f�r index �r blankt 
//						button[aiRoll].setText("O");// om det �r blankt set text Till 'O'
//						cross = false;	//cross false 
//						}
					// funkar n�got men man m�ste spamma p� en knapp f�r att han skall generera 
					// ett en AI Roll.....
					// tittar p� l�sning i skrivande stund :)   
//					do {
//						int aiRoll = rand.nextInt(8);// generar ett slumptal 
//						if (button[aiRoll].getText() == "") {// kastar in talet som index i arrayenn ser om elementet f�r index �r blankt 
//							button[aiRoll].setText("O");// om det �r blankt set text Till 'O'
//							cross = false;
//							}
//					}while(cross);

				} else {//n�r false �r det 'X' tur
					if (button[i].getText() == "") {
						button[i].setText("X");
						cross = true;//vi kan s�ga logiken �r n�r Kryss lagt sitt svar �r Boolska variabeln == True
//						int aiRoll = rand.nextInt(8);// generar ett slumptal 
//						if (button[aiRoll].getText() == "") {// kastar in talet som index i arrayenn ser om elementet f�r index �r blankt 
//							button[aiRoll].setText("O");// om det �r blankt set text Till 'O'
//							cross = false;	//cross false 
//							}
						do {
							int aiRoll = rand.nextInt(8);// generar ett slumptal 
							if (button[aiRoll].getText() == "") {// kastar in talet som index i arrayenn ser om elementet f�r index �r blankt 
								button[aiRoll].setText("O");// om det �r blankt set text Till 'O'
								cross = false;
								}
						}while(cross);
					}
				}

			}
			

		}// reseten fungerar men �nd� inte �ppnar bara ett nyttf�nster som det �r nu men �m ja 
		// f�tt ihop n�got iallfall :) 
		if(e.getSource()==resetButton) {
			this.dispose();
			
			new ThaFrame2();
//			frame.getContentPane().invalidate();
//			frame.getContentPane().validate();
			frame.getContentPane().repaint();
		}
	}
}
