package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public Socket clientSocket;
	public PrintWriter out;
	public BufferedReader in;
	public String currentMessage;
	

	public MyClient(String ip, int portNumber) throws Exception {
		this.connectToServer(ip, portNumber);
	}
	
	public MyClient() throws Exception {
		
		this.connectToServer("localhost", 40008); // a default attempt at connection
	}
	
	public void connectToServer(String ip, int portNumber) throws Exception {
		System.out.println("Client now attempting to connect to server at ip: " + ip + " and port " + portNumber);
		try {
			clientSocket = new Socket(ip, portNumber);
		this.out = new PrintWriter(clientSocket.getOutputStream(), true);
		this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		// out.println("Hi I am client, I try to talk to you!");
		} catch (ConnectException e) {
			e.printStackTrace();
			System.out.println("Error, could not connect to server using ip: " + ip + " and portNumber " + portNumber);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error, Unknown host exception trying to connect to server using ip: " + ip + " and portNumber " + portNumber);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		this.currentMessage = "";
	}

}
