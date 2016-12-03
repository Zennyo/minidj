package connection;

import logic.*;
import java.io.*;
import java.net.*;

public class TCPConnector {
	String ip;
	int port;
	
	public TCPConnector(int port){
		this.port = port;
	}
	
	public void listen(){
		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("[+] -wait for accept-");
			Socket socket = server.accept();
			try {
				System.out.println("[+] -accepted-");
                ObjectInputStream objectInput = new ObjectInputStream(socket.getInputStream());
                try {
                    Object object =(Item) objectInput.readObject();
                    Item tmp = (Item) object;
                    System.out.println(tmp.getPayload());
                    System.out.println("[+] -end-");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }  
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void main(String[] args){
		TCPConnector con = new TCPConnector(6789);
		System.out.println("[+] -start listen-");
		con.listen();	
	}
	
}
