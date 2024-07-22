package com.omkar.awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Frame2 {
	 static TextField tf1 = new TextField();
	 static TextField tf2 = new TextField();
	public static void main(String[] args) {
		Frame frame = new Frame();
		Label label1 = new Label("Enter Num1");
		Label label2= new Label("Enter Num2");
		
		label1.setBounds(100,100,100,30);
		frame.add(label1);
		label2.setBounds(100,130,100,30);
		frame.add(label2);
		
		 
		
		tf1.setBounds(230,100,100,30);
		frame.add(tf1);
		tf2.setBounds(230,130,100,30);
		frame.add(tf2);
		
		
		Button button1 = new Button("Add");
		button1.setBounds(250,250,50,20);
		frame.add(button1);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Integer num1 = Integer.parseInt(tf1.getText());
				Integer num2 = Integer.parseInt(tf2.getText());
				 System.out.println(num1+num2);
				
			}
		});
		
		
		frame.setTitle("Omkar");
		
		frame.setSize(700,700);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
