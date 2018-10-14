package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	Socket clientSocket;
	PrintWriter out;
	BufferedReader in;
	

	public MyClient(String ip, int portNumber) {
		this.connectToServer(ip, portNumber);
	}
	
	public MyClient() {
		
		this.connectToServer("defaultIPgoesHere", 8002); // a default attempt at connection
	}
	
	public void connectToServer(String ip, int portNumber) {
		try {
			clientSocket = new Socket(ip, portNumber);
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
