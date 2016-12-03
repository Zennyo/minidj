package connection;

import logic.*;
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
				Player.spielenPlayer(Player.mediaPlayer);
				break;
			case "pause1":
				Player.pausePlayer(Player.mediaPlayer);
				break;
			case "stop1":
				Player.stopPlayer(Player.mediaPlayer);
				break;
				
				
			case "play2":
				Player.spielenPlayer(Player.mediaPlayer2);
				break;
			case "pause2":
				Player.pausePlayer(Player.mediaPlayer2);
				break;
			case "stop2":
				Player.stopPlayer(Player.mediaPlayer2);
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
				Player.mediaPlayer.setVolume(1-(item.getVolume()/100));
				Player.mediaPlayer2.setVolume(0+(item.getVolume()/100));
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
