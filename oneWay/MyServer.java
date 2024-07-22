package com.omkar.socket.oneWay;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(7777);
		
		Socket socket = ss.accept();
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String input = null;
		
		while(true) {
			System.out.println("Input from clint");
		  input = dis.readUTF();	
		  System.out.println(input);
		  if(input.equalsIgnoreCase("end")) break;
		}
	}

}
