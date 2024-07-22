package com.omkar.awt;

import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class List {

	public List() {
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame();
			DefaultListModel<String> model = new DefaultListModel<String>();
			model.addElement("Omkar");
			model.addElement("Omkar");
			model.addElement("Omkar");
			model.addElement("Omkar");
			
			JList<String> list = new JList<String>(model);
			
			frame.add(list);
			
			frame.setSize(700,700);
			frame.setLayout(new FlowLayout());
			frame.setVisible(true);
			
			
	}
	public static void main(String[] args) {
		new List();
	}
}
