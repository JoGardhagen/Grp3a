package com.grp3a.ticTacToe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



@SuppressWarnings("Vet inte vad detta �r heller. . .")// var seriel f�rst innan �ndring :) 
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
		frame.getContentPane().setBackground(Color.GREEN);// den h�r f�rgen �r �cklig . . .
		frame.setVisible(true);
		frame.add(button);
		frame.add(button2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {// man kan egentligen sl�nga in vad som helst i dessa KodBlock om jag har fattat r�tt.
			System.out.println("Test 1");// Denna g�ng �ppnar den upp nya f�nster.
			//new ThaFrame(); // �ppnar upp den nya spelplanen 
		}
		if (e.getSource() == button2) {
			System.out.println("Test 2");
			new ThaFrame2(); // �ppnar upp den �ldre spelplanen.
		}
		
	}

}
