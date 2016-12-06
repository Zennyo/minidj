package connection;

import logic.*;
import logic.Player.RECORD;

import java.io.*;
import java.net.*;

import javafx.scene.media.MediaPlayer;

public class TCPConnector {
	
	TCPServer tcpServer;
	Player player;
	
	public TCPConnector(){
		
	}
	
	public void executeAppOrder(Item item){
		String pushedButton = item.getPayload();
		switch(pushedButton){
		
			case "play1":
				Player.play(RECORD.LEFT);
				break;
			case "pause1":
				Player.pause(RECORD.LEFT);
				break;
			case "stop1":
				Player.stop(RECORD.LEFT);
				break;
				
				
			case "play2":
				Player.play(RECORD.RIGHT);
				break;
			case "pause2":
				Player.pause(RECORD.RIGHT);
				break;
			case "stop2":
				Player.stop(RECORD.RIGHT);
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
				System.out.println(item.getVolume());
				
				Player.volume(RECORD.LEFT,1-(item.getVolume()/100));
				Player.volume(RECORD.RIGHT,0+(item.getVolume()/100));
				break;
		}
	}
	
	
	public void sendPlaylistToClient(String ip, int port){
        //tba
	}
	
	
	public void startTCPServer(int port){
		tcpServer = new TCPServer(port, this);
		tcpServer.start();
	}
	
	public void stopTCPServer(){
		tcpServer.killTCPServer();
	}
}
