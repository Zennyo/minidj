package connection;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import logic.Item;

public class TCPServer extends Thread {
	boolean running = true;
	int port;
	ServerSocket server;
	Socket socket;
	
	public TCPServer(int port){
		this.port = port;
	}
	
	public void killTCPServer(){
		this.running = false;
	}
	
	public void run(){
		try {
			server = new ServerSocket(port);
			System.out.println("[+]-TCP server start running-");
			while(running){
				System.out.println("[+]-waiting for accept-");
				socket = server.accept();
				try {
					System.out.println("[+]-accepted-");
	                ObjectInputStream objectInput = new ObjectInputStream(socket.getInputStream());
	                try {
	                	System.out.println("[+]-reading object-");
	                    Object object =(Item) objectInput.readObject();
	                    Item item = (Item) object;
	                    //--------------------------------------------
	                    
	                    System.out.println(item.getPayload());
	                    
	                    //--------------------------------------------
	                    System.out.println("[+]-end reading-");
	                } catch (ClassNotFoundException e) {
	                    e.printStackTrace();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
			}
			socket.close();
			server.close();
			System.out.println("[+] -Server killed-");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
