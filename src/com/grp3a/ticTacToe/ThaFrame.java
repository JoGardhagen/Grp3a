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


//I stort s�tt samma som innan men Construktas fr�n sin egen Class
public class ThaFrame extends JFrame implements ActionListener {
	// Nya knappar
//	JButton button;// knapp
//	JButton button2;
//	JButton button3;
//	JButton button4;
	JButton[] button = new JButton[9];// f�r nya Knappar
	JPanel buttonsPanel = new JPanel();// Panel f�r nya knappar
	JFrame frame = new JFrame();
	JLabel lable = new JLabel();
	JPanel topPanel = new JPanel(); 

	ThaFrame() {

//		button = new JButton("1");
//		button.setBounds(100, 100, 100, 100);
//		button.addActionListener(this);
//		//button.setText("Btn 1");
//		button.setFocusable(false);
//		button2 = new JButton("2");
//		button2.setBounds(200, 100, 100, 100);
//		button2.addActionListener(this);
//		//button.setText("Btn 1");
//		button3 = new JButton("3");
//		button3.setBounds(300, 100, 100, 100);
//		button3.addActionListener(this);
//		//button.setText("Btn 1");
//		button3.setFocusable(false);
//		button4 = new JButton("4");
//		button4.setBounds(100,200,100,100);
//		button4.addActionListener(this);
		
//	    //Random random = new Random();        // To random pick who's going first.
//	    JFrame play_frame = new JFrame();    // The frame work
////	    JPanel button_panel = new JPanel();    // The button panels
////	    JPanel title_panel = new JPanel();    // The panel for the Titel and the one that will tell the random player that gets to start
////	    JLabel textfield = new JLabel();    // text fields for labels
////	    boolean playerOne;                    // to set who's who. Don't need to have one for playerTwo since the boolean is either true or false.
//
//	    button_panel.setLayout(new GridLayout(3,3));
//	    button_panel.setBackground(Color.RED);
		buttonsPanel.setLayout(new GridLayout(3, 3));
		buttonsPanel.setPreferredSize(new Dimension(300,300));
		//for loop f�r att st�lla upp 9 knappar
		for (int i = 0; i < 9; i++) {
			button[i] = new JButton();
			buttonsPanel.add(button[i]);
			// button[i].setFont(new Font("MV Boli",Font.BOLD,120));
			button[i].addActionListener(this);
			// button[i].setFocusable(false);
			button[i].setText("");
		}
		
		//BorderLayout border =new BorderLayout();
		lable.setBackground(Color.ORANGE);
		lable.setBounds(100,100,100,100);
		lable.setText("Test Lable");
		//border.addLayoutComponent(lable, accessibleContext);
		topPanel.add(lable);
		topPanel.setPreferredSize(new Dimension(100,100));
		topPanel.setBackground(Color.ORANGE);
		//buttonsPanel.add(lable);
		//Border border = BorderFactory.createLineBorder(Color.RED);
		frame.setTitle("Tic-Tac-Toe :  Grp3a.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(500, 500);// f�rnster storlek
		frame.getContentPane().setBackground(Color.RED);// Ny F�rg R�d :)
		frame.setVisible(true);
		frame.add(buttonsPanel,BorderLayout.CENTER);//paneler g�r det m�jligt att l�gga saker var man vill :) 
		frame.add(topPanel,BorderLayout.NORTH);
		
//		this.add(button);
//		this.add(button2);
//		this.add(button3);
//		this.add(button4);
	}

	// vad som h�nder n�r man trycker p� knappen i nul�get inget mer en skriver ut
	// Test i konsolen
	// �ndrar nu Tecken till Kryss
	@Override
	public void actionPerformed(ActionEvent e) {//ny listener f�r nya knapparna 
		for(int i = 0;i<9;i++) {
			if(e.getSource()==button[i]) {
				button[i].setText("x");
				
			}// gissar p� att det h�r vi skall ha n�gon form av if sats f�r att 
			// sl�nga in logiken.
		}
//		if(e.getSource()==button) {
//			System.out.println("test");
//			button.setText("x");// �ndrar texten till ett kryss ist�llt 
//		}
//		if(e.getSource()==button2) {
//			System.out.println("test2");
//			button2.setText("x");
//		}
//		if(e.getSource()==button3) {
//			System.out.println("test3");
//			button3.setText("x");
//		}
//		if(e.getSource()==button4) {
//			System.out.println("test 4");
//			button4.setText("x");
//		}
	}
}
