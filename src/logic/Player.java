package logic;

import java.net.Inet4Address;

import connection.TCPConnector;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.stage.Stage;

public class Player extends Application{
	
	
    private static MediaPlayer leftPlayer;
    private static MediaPlayer rightPlayer;
    public static enum RECORD{
    	LEFT,RIGHT
    }
    
	
	 public static void main(String[] args) {
        TCPConnector con = new TCPConnector();
		con.startTCPServer(6080);
        launch(args);
    }
	 
	 public static void play(RECORD record){
			switch(record){
				case LEFT:
					leftPlayer.play();
					leftPlayer.setCycleCount(MediaPlayer.INDEFINITE);
					break;
				case RIGHT:
					rightPlayer.play();
					rightPlayer.setCycleCount(MediaPlayer.INDEFINITE);
					break;
				
			}
		}
	 
	 public static void pause(RECORD record){
		 switch(record){
			case LEFT:
				leftPlayer.pause();
				break;
			case RIGHT:
				rightPlayer.pause();
				break;
			
		}
		}
	 public static void stop(RECORD record){
		 switch(record){
			case LEFT:
				leftPlayer.stop();
				break;
			case RIGHT:
				rightPlayer.stop();
				break;
			
		}
		}
	 
	 public static void volume(RECORD record, double volume){
		 switch(record){
			case LEFT:
				leftPlayer.setVolume(volume);
				break;
			case RIGHT:
				rightPlayer.setVolume(volume);
				break;
			
		}
		
	 }
	
	 @Override
    public void start(Stage monStage) throws Exception {

        monStage.setTitle(Inet4Address.getLocalHost().getHostAddress());
       
       Group root = new Group();
       Scene maScene = new Scene(root, 800, 400, Color.GRAY);
       monStage.setScene(maScene);
       Group header = new Group();
       Group rechtView = new Group();
       Group linksView = new Group();
       
       // Component definition
       Circle disc = new Circle(150, Color.web("black", 0.9));
       Circle disc1 = new Circle(150, Color.web("black", 0.9));
       Rectangle rec0 = new Rectangle();
       Rectangle rec1 = new Rectangle();
       

        LinearGradient lg1 = new LinearGradient(5, 0, 1, 0, true, CycleMethod.NO_CYCLE);
        
        //Disc
        disc.setCenterX(600);
        disc.setCenterY(230);
        disc1.setCenterX(180);
        disc1.setCenterY(230);
        
        //Rec3
        rec0.setX(45);

        rec0.setY(10);

        rec0.setWidth(700);

        rec0.setHeight(50);

        rec0.setFill(Color.WHITE);

        rec0.setStroke(Color.BLACK);

//        rec0.setStrokeWidth(5);

        rec0.setArcHeight(30);
        rec0.setArcWidth(30);
       
        header.getChildren().add(rec0);
        
        rechtView.getChildren().add(disc1);
        linksView.getChildren().add(disc);

	    
        root.getChildren().add(linksView);
        root.getChildren().add(rechtView);
        
        
        monStage.show();   	

    }

}
