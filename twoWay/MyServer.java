package com.omkar.socket.twoWay;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(7777);
		
		Socket socket = ss.accept();
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String out = "";
		Scanner scanner = new Scanner(System.in);
		while(!out.equalsIgnoreCase("end")) {
			String input = dis.readUTF();
			
			System.out.println("message from clint ");
			System.out.println(input);
			System.out.println("enter the message to clint");
			out = scanner.nextLine();
			dos.writeUTF(out);
			dos.flush();
			
		}
	}

}
