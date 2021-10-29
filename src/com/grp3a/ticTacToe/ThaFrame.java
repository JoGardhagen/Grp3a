package com.grp3a.ticTacToe;

import java.awt.BorderLayout;
//sida 376
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//I stort sätt samma som innan men Construktas från sin egen Class
public class ThaFrame extends JPanel implements ActionListener {

	JButton[] button = new JButton[9]; 			// knapparna
	Random random = new Random(); 				// Slumpar vem som går först
	JFrame playFrame = new JFrame(); 			// Själva ramen för spelet
	JPanel buttonPanels = new JPanel(); 		// Knapp panelen
	JPanel titlePanels = new JPanel(); 			// deklarerar Panelen 

	JLabel textfield = new JLabel(); 			// Deklarerar text rutor 
	int xWinsCount;								// Kunna räkna poängen???????????????????????????????????????????
	int oWinsCount;								// HAar inte gjort ngt där tänkte vi kanske kan komma på ngt coolt

	boolean playerOne; 							// Sätts för att kontrollera vem som börjar. antingen true eller false

	ThaFrame() {
//Sen har jag egentligen bara ändrat namn och storlek för att det ska få plats, Vi kan ändra färger och allt sen för mig kvittar det! :D
		
		playFrame.setTitle("Tic-Tac-Toe :  Grp3a.");
		playFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		playFrame.setSize(800, 500);// förnster storlek
		playFrame.getContentPane().setBackground(Color.BLACK);// Ny Färg Röd :)
		playFrame.setLayout(new BorderLayout());
		playFrame.setVisible(true);
		textfield.setBackground(Color.black);						// Bakgrundsfärg för spel titel
		textfield.setForeground(Color.RED);							// Font färg för titeltext
		textfield.setFont(new Font("Bell MT", Font.ITALIC, 45));	 // Font för Spel titel
		textfield.setHorizontalAlignment(JLabel.CENTER);			// Horizontell titel Centrerad
		textfield.setText("Välkommen till Tic Tac Toe!");
		textfield.setOpaque(true); 							// Satt på true då vi inte vill att annan färg ska "lysa igenom" textrutan

		titlePanels.setLayout(new BorderLayout());		// Titel layout och storlek
		titlePanels.setBounds(0, 0, 900, 900);

		buttonPanels.setLayout(new GridLayout(3, 3));			// Gör spel planen 3x3
		buttonPanels.setBackground(Color.RED);					// Rödbakgrund på spelplan

		for (int i = 0; i < 9; i++) 
		{			// lägger ut knapparna på spel planen
			button[i] = new JButton();
			buttonPanels.add(button[i]);
			button[i].setFont(new Font("Bell MT", Font.ROMAN_BASELINE, 100));
			button[i].addActionListener(this);
			button[i].setFocusable(false);
		}
		
		JLabel t1 = new JLabel("Player X");					// Deklarerar ny Label för spelare x och o
		t1.setFont(new Font("Bell MT", Font.BOLD, 25));		// Textsnitt för sido text på spelplan
		t1.setForeground(Color.RED);
		JLabel t2 = new JLabel("Player O");			
		t2.setFont(new Font("Bell MT", Font.BOLD, 25));		// Textsnitt och storlek samt i fetstil
		t2.setForeground(Color.red);
		
		titlePanels.add(textfield);
		playFrame.add(titlePanels, BorderLayout.NORTH);
		playFrame.add(buttonPanels);
		playFrame.add(t1, BorderLayout.WEST);		// Sätter text på höger sida	
		playFrame.add(t2, BorderLayout.EAST);		// Sätter text på vänster sida

	}

	
			// Kontrollerar om X vinner, 8 olika möjligheter De ba Copy paste för X och O
	
	// Man kanske kan göra en ForLoop här istället??
	
	
	public  void check() {
	
		if 		((button[0].getText() == "X") && (button[1].getText() == "X") && (button[2].getText() == "X")) {
			winner_X(0, 1, 2);
		}
		else if ((button[3].getText() == "X") && (button[4].getText() == "X") && (button[5].getText() == "X")) {
			winner_X(3, 4, 5);
		}
		else if ((button[6].getText() == "X") && (button[7].getText() == "X") && (button[8].getText() == "X")) {
			winner_X(6, 7, 8);// --------------------------------------
		}
		else if ((button[0].getText() == "X") && (button[3].getText() == "X") && (button[6].getText() == "X")) {
			winner_X(0, 3, 6);
		}
		else if ((button[1].getText() == "X") && (button[4].getText() == "X") && (button[7].getText() == "X")) {
			winner_X(1, 4, 7);
		}
		else if ((button[2].getText() == "X") && (button[5].getText() == "X") && (button[8].getText() == "X")) {
			winner_X(2, 5, 8);
		}
		else if ((button[0].getText() == "X") && (button[4].getText() == "X") && (button[8].getText() == "X")) {
			winner_X(0, 4, 8);
		}
		else if ((button[2].getText() == "X") && (button[4].getText() == "X") && (button[6].getText() == "X")) {
			winner_X(2, 4, 6);
		}

		
		// Kontrollerar om O vinner, 8 olika möjligheter
		
		else if  ((button[0].getText() == "O") && (button[1].getText() == "O") && (button[2].getText() == "O")) {
			winner_O(0, 1, 2);
		}
		else if  ((button[3].getText() == "O") && (button[4].getText() == "O") && (button[5].getText() == "O")) {
			winner_O(3, 4, 5);
		}
		else if ((button[6].getText() == "O") && (button[7].getText() == "O") && (button[8].getText() == "O")) {
			winner_O(6, 7, 8);
		}
		else if ((button[0].getText() == "O") && (button[3].getText() == "O") && (button[6].getText() == "O")) {
			winner_O(0, 3, 6);
		}
		else if ((button[1].getText() == "O") && (button[4].getText() == "O") && (button[7].getText() == "O")) {
			winner_O(1, 4, 7);
		}
		else if ((button[2].getText() == "O") && (button[5].getText() == "O") && (button[8].getText() == "O")) {
			winner_O(2, 5, 8);
		}
		else if ((button[0].getText() == "O") && (button[4].getText() == "O") && (button[8].getText() == "O")) {
			winner_O(0, 4, 8);
		}
		else if ((button[2].getText() == "O") && (button[4].getText() == "O") && (button[6].getText() == "O")) {
			winner_O(2, 4, 6);
		}

	}

			public void winner_X(int a, int b, int c) {
					button[a].setBackground(Color.BLACK);
					button[b].setBackground(Color.BLACK);
					button[c].setBackground(Color.BLACK);
				for (int i = 0; i < 9; i++) {
					button[i].setEnabled(false);
				}
					textfield.setText("Winner is X");
				xWinsCount++;
			}

			public void winner_O(int a, int b, int c) {
					button[a].setBackground(Color.BLACK);
					button[b].setBackground(Color.BLACK);
					button[c].setBackground(Color.BLACK);
				for (int i = 0; i < 9; i++) {
					button[i].setEnabled(false);
				}
					textfield.setText("Winner is O");
				oWinsCount++;
	}

						
			
	@Override		// Visar vems tur det är och markerar i rutorna X eller O
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			if (e.getSource() == button[i]) {
				if (playerOne) {
					if (button[i].getText() == "") {
						button[i].setForeground(Color.red);
						button[i].setText("X");
						playerOne = false;
						textfield.setText("O's turn");
						check();

					}
				} else {
					if (button[i].getText() == "") {
						button[i].setForeground(Color.black);
						button[i].setText("O");
						playerOne = true;
						textfield.setText("X's turn");
						check();

					}
				}
			}
		}
	}

}
