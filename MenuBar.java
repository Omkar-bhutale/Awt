package com.omkar.awt;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar {
	public MenuBar() {
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame();
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		
		JMenuItem i1,i2,i3,i4,i5;

		i1 = new JMenuItem("open");
		file.add(i1);
		i2 = new JMenuItem("close");
		file.add(i2);
		i3 = new JMenuItem("print");
		file.add(i3);
		i4 = new JMenuItem("copy");
		edit.add(i4);
		i5 = new JMenuItem("past");
		edit.add(i5);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(file);
		menuBar.add(edit);
		
		frame.setJMenuBar(menuBar);
		
		frame.setSize(700,700);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new MenuBar();
	}

}
