package me.pogostick29dev.swing101;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class Swing101 {
	
	public Swing101() {
		JFrame frame = new JFrame("Swing 101");
		
		JLabel label = new JLabel("Hello, world!");
		label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		label.setForeground(Color.WHITE);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		frame.add(label);
		
		JButton button = new JButton("Click me.");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Good job!");
			}
		});
		frame.add(button);
		
		JCheckBox checkBox = new JCheckBox("Check me.");
		checkBox.isSelected();
		frame.add(checkBox);
		
		ButtonGroup radioGroup = new ButtonGroup();
		
		JRadioButton radioButton = new JRadioButton("Fill me.");
		radioGroup.add(radioButton);
		frame.add(radioButton);
		
		JRadioButton radioButton2 = new JRadioButton("Another one.");
		radioGroup.add(radioButton2);
		frame.add(radioButton2);
		
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
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