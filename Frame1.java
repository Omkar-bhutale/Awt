package com.omkar.awt;

import java.awt.*;

public class Frame1 extends java.awt.Frame{
	
	public Frame1() {
		Label label = new Label("Enter First Name");
		label.setBounds(100, 100, 100, 30);
		add(label);
		TextField tField = new TextField("Enter text here");
		tField.setBounds(140,100,100,30);
		add(tField);
		
        setTitle("Frame");
        setSize(700, 700);
        setLayout(null); // Using FlowLayout for simplicity
        setVisible(true);
	}
	public static void main(String[] args) {
		
		Frame1 frame1 = new Frame1();

	}

}
