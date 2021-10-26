package com.grp3a.ticTacToe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

///////////////////////////////////Idé att vi ska gör GUI Lösning////////////////////////////////
		
		
		JFrame frame = new JFrame("Välkommen");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel primary = new JPanel();
		primary.setBackground(Color.red);
		primary.setPreferredSize(new Dimension(500,500));
		
		frame.getContentPane().add(primary);
		frame.pack();// viktig
		frame.setVisible(true);// viktig	
		
///////////////////////////////////////Knapp Test  1   /////////////////////////////////////////	
		
		JButton button1 = new JButton("Ruta 0,0 ");
		
		button1.setBounds(10, 10, 100, 100);
		frame.add(button1);
		frame.setLayout(null);
		button1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			           System.out.println("Ruta 0,0 == Clicked");  
			        }  
			    });  

	
	}
	
	

}
