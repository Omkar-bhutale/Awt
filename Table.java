package com.omkar.awt;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table extends JFrame {
	public Table() {
		// TODO Auto-generated constructor stub
		String[][] student = {{"1","omkar","Latudr"},{"1","omkar","Latudr"},{"1","omkar","Latudr"}};
		
		String[] meta = {"id","name","addr"};
		
		JTable table = new JTable(student,meta);
		
		
		add(table);
		
		JScrollPane jcPane = new JScrollPane(table);
		jcPane.setBounds(200,200,300,300);
		
		add(jcPane);
		
		setSize(700,700);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Table();
	}

}
