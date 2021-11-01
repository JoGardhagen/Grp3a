package com.grp3a.ticTacToe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



@SuppressWarnings("Vet inte vad detta är heller. . .")// var seriel först innan ändring :) 
public class EvenAnotherFrame extends JFrame implements ActionListener {
	
	JButton button;
	JButton button2;
	EvenAnotherFrame() {
		JFrame frame = new JFrame();
		button = new JButton("ThaFrame Nya");
		button2 = new JButton("OldOne");

		button.setBounds(0, 0, 200, 100);
		button.addActionListener(this);
		button.setFocusable(false);

		button2.setBounds(0, 100, 200, 100);
		button2.addActionListener(this);
		button2.setFocusable(false);

		frame.setTitle("Main Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.getContentPane().setBackground(Color.GREEN);// den här färgen är Äcklig . . .
		frame.setVisible(true);
		frame.add(button);
		frame.add(button2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {// man kan egentligen slänga in vad som helst i dessa KodBlock om jag har fattat rätt.
			System.out.println("Test 1");// Denna gång öppnar den upp nya fönster.
			//new ThaFrame(); // öppnar upp den nya spelplanen 
		}
		if (e.getSource() == button2) {
			System.out.println("Test 2");
			new ThaFrame2(); // öppnar upp den äldre spelplanen.
		}
		
	}

}
