package com.omkar.socket.twoWay;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClint {
	public static void main(String[] args)  throws Exception{
		Socket socket = new Socket("localhost",7777);
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String out = "";
		Scanner scanner = new Scanner(System.in);
		while(!out.equalsIgnoreCase("end")) {
			System.out.println("enter the message to server");
			out = scanner.nextLine();
			
			dos.writeUTF(out);
			dos.flush();
			String input = dis.readUTF();
			System.out.println("message from server ");
			System.out.println(input);
		}
		dos.close();
		scanner.close();
		socket.close();
	}

}
