package logic;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Player extends Application{
	
	 public static void main(String[] args) {
        System.out.println( "Main method inside Thread : " +  Thread.currentThread().getName());
        launch(args);
        
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
        
        Rectangle rec0 = new Rectangle();
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();
        Text welcome = new Text(90, 42, "Wilkommen auf dein Minidj App: Music hören einfach machen");
        Text artist = new Text(90, 42, "Artist : ");
        Text title = new Text(90, 42, "Title : ");
        
        //Welcome Texte
        welcome.setFont(new Font(20));
        welcome.setFill(Color.BLACK);
        
        //Rec1
        rec1.setX(30);

        rec1.setY(75);

        rec1.setWidth(350);

        rec1.setHeight(300);

        rec1.setFill(Color.BLACK);

        rec1.setStroke(Color.WHITE);
        
        //Rec2
        rec2.setX(420);

        rec2.setY(75);

        rec2.setWidth(350);

        rec2.setHeight(300);

        rec2.setFill(Color.BLACK);

        rec2.setStroke(Color.WHITE);
        
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
        rechtView.getChildren().add(title);
        rechtView.getChildren().add(artist);
        linksView.getChildren().add(title);
        linksView.getChildren().add(artist);
        
        
        root.getChildren().add(header);
        root.getChildren().add(rec1);
        root.getChildren().add(rec2);
        monStage.show();
    }

}
