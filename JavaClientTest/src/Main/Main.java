package Main;

import client.MyClient;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting up the client");
		MyClient client = new MyClient();
		System.out.println("Does CLIENT Reach this last line of code?");
	}

}
