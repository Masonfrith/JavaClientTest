package Main;

import client.MyClient;


public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting up the client");
		MyClient client = new MyClient();
		
		System.out.println("Client now connected to server.\nready to send message, type QUIT to quit.");
		
		while(!client.currentMessage.equals("QUIT")) {
			client.out.println(client.userInput.readLine());
			client.currentMessage = client.in.readLine();
			System.out.println("Server: " + client.currentMessage);
		}
		
		
		System.out.println("Client shutting down now.");
		
		client.in.close();
		client.out.close();
		client.clientSocket.close();
		
		System.out.println("Shutdown completed.");
	}

}
