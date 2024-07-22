package com.omkar.awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.color.ColorSpace;

public class graphics extends Frame {
	public graphics() {
		setSize(700, 700);
		setLayout(null);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Color c1 = new Color(100,150,200);
		Color c2 = Color.GREEN;
		g.setColor(c1);
		g.fillRect(100, 100, 100, 100);
		g.fillOval(300, 300, 100, 100);
		Font font = new Font("ALGERIAN",Font.BOLD,50);
		g.setFont(font);
		g.drawString("HELLO JI",220, 200);
		g.fillArc(100,300, 50, 50, 0, 90);
	}
	public static void main(String[] args) {
		new graphics();
	}
	

}
