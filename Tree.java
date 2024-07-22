package com.omkar.awt;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree {
	public Tree() {
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame();
		
		
		DefaultMutableTreeNode node = new DefaultMutableTreeNode("RSML");
		
	
		
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("bsc cs");
		node.add(node1);
		DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("bca");
		node.add(node2);
		DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("DIV A");
		node1.add(node3);
		DefaultMutableTreeNode node4 = new DefaultMutableTreeNode("DIV B");
		node1.add(node4);
		DefaultMutableTreeNode node5 = new DefaultMutableTreeNode("DIV A");
		node2.add(node5);
		DefaultMutableTreeNode node6 = new DefaultMutableTreeNode("DIV B");
		node2.add(node6);
		
		JTree tree = new JTree(node);
		frame.add(tree);
		
		frame.setSize(700,700);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		
		
		
	}
	public static void main(String[] args) {
		new Tree();
		
	}

}
