package me.pogostick29dev.swing101;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Swing101 {
	
	public Swing101() {
		JFrame frame = new JFrame("Swing 101");
		
		JLabel label = new JLabel("Hello, world!");
		label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		label.setForeground(Color.WHITE);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		frame.add(label);
		
		frame.setSize(640, 480);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Swing101();
	}
}