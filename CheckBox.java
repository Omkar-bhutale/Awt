package com.omkar.awt;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class CheckBox {
	public CheckBox() {
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame();
		
		JCheckBox box = new JCheckBox("java");
		JCheckBox box1 = new JCheckBox("c++");
		frame.add(box1);
		frame.add(box);
		
		
		JRadioButton button = new JRadioButton("Java");
		JRadioButton button1 = new JRadioButton("Java2");
		JRadioButton button2 = new JRadioButton("Java3");
		
		ButtonGroup group = new ButtonGroup();
		group.add(button2);
		group.add(button1);
		group.add(button);
		
		frame.add(button2);
		frame.add(button1);
		frame.add(button);
		
		
		frame.setSize(700,700);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	}
	public static void main(String[] args) {
		new CheckBox();
	}

}
