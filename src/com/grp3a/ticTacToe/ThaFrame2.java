package com.grp3a.ticTacToe;

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

//I stort sätt samma som innan men Construktas från sin egen Class

@SuppressWarnings("Vet inte va detta är ...")
public class ThaFrame2 extends JFrame implements ActionListener {

	JButton[] button = new JButton[9];// för nya Knappar
	JPanel buttonsPanel = new JPanel();// Panel för nya knappar
	JFrame frame = new JFrame();
	JLabel lable = new JLabel();
	JPanel topPanel = new JPanel();
	boolean cross;//bools variable för 'X'
	Random rand = new Random();
	
	
	ThaFrame2() {
		
		buttonsPanel.setLayout(new GridLayout(3, 3));
		buttonsPanel.setPreferredSize(new Dimension(300, 300));
		// for loop för att ställa upp 9 knappar
		for (int i = 0; i < 9; i++) {
			button[i] = new JButton();
			buttonsPanel.add(button[i]);
			button[i].addActionListener(this);
			button[i].setText("");
		}

		lable.setBackground(Color.ORANGE);
		lable.setText("Test Lable");
		topPanel.add(lable);
		topPanel.setPreferredSize(new Dimension(10, 50));
		topPanel.setBackground(Color.ORANGE);

		frame.setTitle("Tic-Tac-Toe :  Grp3a.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(500, 500);// förnster storlek
		frame.getContentPane().setBackground(Color.RED);// Ny Färg Röd :)
		frame.setVisible(true);
		frame.add(buttonsPanel, BorderLayout.CENTER);// paneler gör det möjligt att lägga saker var man vill :)
		frame.add(topPanel, BorderLayout.NORTH);

	}//gör inget just nu 
//	public void AiRoll() {
//		for (int i = 0; i < 9; i++) {
//			int aiRoll = rand.nextInt(8);// generar ett slumptal 
//			if (button[aiRoll].getText() == "") {// kastar in talet som index i arrayenn ser om elementet för index är blankt 
//				button[aiRoll].setText("O");// om det är blankt set text Till 'O'
//				cross = false;	//cross false 
//				}
//		}
//	}
	
	// vad som händer när man trycker på knappen i nuläget inget mer en skriver ut
	// Test i konsolen
	// ändrar nu Tecken till Kryss
	@Override
	public void actionPerformed(ActionEvent e) {// ny listener för nya knapparna
		for (int i = 0; i < 9; i++) {
			if (e.getSource() == button[i]) {
				if (cross) {//när true är det 'O' tur, 
					//AiRoll();
					int aiRoll = rand.nextInt(8);// generar ett slumptal 
					if (button[aiRoll].getText() == "") {// kastar in talet som index i arrayenn ser om elementet för index är blankt 
						button[aiRoll].setText("O");// om det är blankt set text Till 'O'
						cross = false;	//cross false 
						}
					// funkar något men man måste spamma på en knapp för att han skall generera 
					// ett en AI Roll.....
					// tittar på lösning i skrivande stund :)   
					

				} else {//när false är det 'X' tur
					if (button[i].getText() == "") {
						button[i].setText("X");
						cross = true;//vi kan säga logiken är när Kryss lagt sitt svar är Boolska variabeln == True
						
					}
				}

			}
			

		}
	}
}
