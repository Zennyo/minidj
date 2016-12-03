package logic;

import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.stage.Stage;

public class Player extends Application{
	
	//Erste Lied
    String musicFile = "C:/Users/Djámel/Desktop/hackDay/emi.mp3";     // For example

    Media sound = new Media(new File(musicFile).toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(sound);
    
    //Zweite Lied
    String soundFile = "C:/Users/Djámel/Desktop/hackDay/kollegah.mp3";     // For example

    Media secondSound = new Media(new File(soundFile).toURI().toString());
    MediaPlayer mediaPlayer2 = new MediaPlayer(secondSound);
	
	 public static void main(String[] args) {
        System.out.println( "Main method inside Thread : " +  Thread.currentThread().getName());
        launch(args);
    }
	 
	 public void spielenPlayer(MediaPlayer m){
			Status status = m.getStatus();
	
			if (status == Status.PAUSED || status == Status.READY || status == Status.STOPPED) {
	
				m.play();
	
			} 
		}
	 
	 public void pausePlayer1(MediaPlayer m){
			Status status = m.getStatus();

			if (status == Status.PLAYING) {

				m.pause();

			} 
		}
	 public void stopPlayer1(MediaPlayer m){
			Status status = m.getStatus();

			if (status == Status.PLAYING) {

				m.stop();

			}
		}
	 
	 public void volume(MediaPlayer m){
		
	 }
	
	 @Override
    public void start(Stage monStage) throws Exception {

        monStage.setTitle("Mini Dj Player");
       
       Group root = new Group();
       Scene maScene = new Scene(root, 800, 400, Color.ORANGE);
       monStage.setScene(maScene);
       Group header = new Group();
       Group rechtView = new Group();
       Group linksView = new Group();
       
       // Component definition
       Circle disc = new Circle(150, Color.web("black", 0.9));
       Circle disc1 = new Circle(150, Color.web("black", 0.9));
       Rectangle rec0 = new Rectangle();
       Rectangle rec1 = new Rectangle();
       Text welcome = new Text(90, 42, "Wilkommen auf dein Minidj App: Music hören einfach machen");
       
        //Welcome Texte
        welcome.setFont(new Font(20));
        welcome.setFill(Color.BLACK);

        LinearGradient lg1 = new LinearGradient(5, 0, 1, 0, true, CycleMethod.NO_CYCLE);
        
        //Disc
        disc.setCenterX(600);
        disc.setCenterY(230);
        //disc.setFill(lg1);
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
        header.getChildren().add(welcome);
        
        rechtView.getChildren().add(disc1);
//        rechtView.getChildren().add(title);
//        rechtView.getChildren().add(artist);
        
        
        linksView.getChildren().add(disc);
//        linksView.getChildren().add(title);
//        linksView.getChildren().add(artist);

	    
        root.getChildren().add(header);
        root.getChildren().add(linksView);
        root.getChildren().add(rechtView);
        
        spielenPlayer(mediaPlayer);
        pausePlayer1(mediaPlayer);
        stopPlayer1(mediaPlayer);
        
        spielenPlayer(mediaPlayer2);
        pausePlayer1(mediaPlayer2);
        stopPlayer1(mediaPlayer2);
        
        mediaPlayer.setVolume(100.0);
        mediaPlayer2.setVolume(0.0);
        
        mediaPlayer.play();
        mediaPlayer2.play();
        
        monStage.show();   	

    }

}
