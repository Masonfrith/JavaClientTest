package Main;

import client.MyClient;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting up the client");
		MyClient client = new MyClient();
		
		
		
		System.out.println("Client shutting down now.");
		
		client.in.close();
		client.out.close();
		client.clientSocket.close();
		
		System.out.println("Shutdown completed.");
	}

}
