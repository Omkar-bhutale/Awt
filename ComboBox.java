package com.omkar.awt;

import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {
	public ComboBox() {
	
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame();
		String[] country = {"india","pakistan","japan"};
		JComboBox<String> jcb = new JComboBox<String>(country);
		f.add(jcb);
		f.setSize(700,700);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ComboBox();
	}

}
