package connection;

import logic.*;
import java.io.*;
import java.net.*;

public class TCPConnector {
	
	TCPServer tcpServer;
	Player player;
	
	public TCPConnector(Player player){
		this.player = player;
	}
	
	public void executeAppOrder(Item item){
		String pushedButton = item.getPayload();
		switch(pushedButton){
		
			case "play1":
				break;
			case "pause1":
				break;
			case "stop1":
				break;
				
				
			case "play2":
				break;
			case "pause2":
				break;
			case "stop2":
				break;
				
				
			case "customkey1":
				break;
			case "customkey2":
				break;
			case "customkey3":
				break;
			case "customkey4":
				break;
			case "customkey5":
				break;
				
			case"newTrack1":
				break;
			case"newTrack2":
				break;
				
			case"volume":
				break;
		}
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
		tcpServer = new TCPServer(port, this);
		tcpServer.start();
	}
	
	public void stopTCPServer(){
		tcpServer.killTCPServer();
	}
}
