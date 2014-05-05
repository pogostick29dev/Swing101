package me.pogostick29dev.swing101;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Swing101 {
	
	public Swing101() {
		JFrame frame = new JFrame("Swing 101");
		frame.setSize(640, 480);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setBackground(Color.CYAN);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Swing101();
	}
}