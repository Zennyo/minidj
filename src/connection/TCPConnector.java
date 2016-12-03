package connection;

import logic.*;
import java.io.*;
import java.net.*;

public class TCPConnector {
	
	TCPServer tcpServer;
	
	public TCPConnector(){
		
	}
	
	
	public void sendPlaylistToClient(Playlist playlist, String ip, int port){
        try {
            Socket clientSocket = new Socket(ip, port);
            ObjectOutputStream outputToServer = new ObjectOutputStream(clientSocket.getOutputStream());
            outputToServer.writeObject(playlist);
            outputToServer.close();
            clientSocket.close();
        }
        catch (java.io.IOException e){
            e.printStackTrace();
        }
	}
	
	
	public void startTCPServer(int port){
		tcpServer = new TCPServer(port);
		tcpServer.start();
	}
	
	public void stopTCPServer(){
		tcpServer.killTCPServer();
	}
	
	
	
	
	public static void main(String[] args){
		TCPConnector con = new TCPConnector();
		con.startTCPServer(6969);
		
	}
	
}
