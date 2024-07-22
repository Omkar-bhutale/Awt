package com.omkar.socket.oneWay;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClint {
	public static void main(String[] args)  throws Exception{
		Socket socket = new Socket("localhost",7777);
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		String out = "";
		Scanner scanner = new Scanner(System.in);
		while(!out.equalsIgnoreCase("end")) {
			System.out.println("enter the message to server");
			out = scanner.nextLine();
			dos.writeUTF(out);
			dos.flush();
		}
		dos.close();
		scanner.close();
		socket.close();
	}

}
