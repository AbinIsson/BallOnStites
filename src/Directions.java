import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
 
public class Directions extends Background 
{
    
    @Override
    
    public void start(Stage primaryStage) 
    {
    
        StackPane root = new StackPane();
        
        Background back = new Background();
      //Basic set up of Start Page
      
        primaryStage.setScene(new Scene(root, 1700, 1000));
        primaryStage.show();
        
        Canvas canvas = new Canvas( 1700, 1000 );
        root.getChildren().add( canvas );
             
        GraphicsContext gc = canvas.getGraphicsContext2D();
      
        
        //Background Image
        Image ball = new Image(ResourceLoader.load("Basketball Court.jpg"), 1700, 1000, false, false);
        gc.drawImage(ball, 0, 0);
        
       //Direction Page Layout
        gc.setFill(Color.ORANGERED);
        gc.setStroke( Color.BLACK );
        gc.setLineWidth(3);
        Font theFont = Font.font( "Verdana", FontWeight.BOLD, 63 );
        gc.setFont( theFont );
        
        gc.fillText( "Directions", 670, 90 );
        gc.strokeText( "Directions", 670, 90 );
        
        
        theFont = Font.font( "Verdana", FontWeight.BOLD, 32 );
        gc.setFont(theFont);
        
        
        /*//Overall Directions
        gc.fillText("1. Take turns for each question starting \nwith Player 1 and then Player 2  ", 470, 700);
        gc.strokeText( "1. Take turns for each question starting \nwith Player 1 and then Player 2", 470, 700 );
        
        gc.fillText("2. Either click or highlight using the arrrows on the \nkeyboard and press the respective buttons shown \non the screen ", 470, 800);
        gc.strokeText( "2. Either click or highlight using the arrrows on the \nkeyboard and press the respective buttons shown \non the screen", 470, 800 );
       
        gc.fillText("3. The less time you take to answer a \nquestion the more points you earn ", 470, 940);
        gc.strokeText( "3. The less time you take to answer a \nquestion the more points you earn ", 470, 940 );
        */
        
        //Directions For Player 1
        /*gc.fillText( "Player 1", 160, 190 );
        gc.strokeText( "Player 1", 160, 190 );*/
        
        gc.fillText("1. Read The Directions", 60, 310);
        gc.strokeText( "1. Read The Directions", 60, 310 );
        
        gc.fillText("2. Click the 'Stop' button to stop the \nbasketball on a specific color", 60, 390);
        gc.strokeText( "2. Click the 'Stop' button to stop the \nbasketball on a specific color", 60, 390 );
        
        gc.fillText("3. The closer you are to green the higher \nyour chances are to make buckets", 60, 500);
        gc.strokeText( "3. The closer you are to green the higher \nyour chances are to make buckets", 60, 500 );
        
        gc.fillText("4. You must score a 70 or \nhigher to make the shot ", 60, 600);
        gc.strokeText( "4. You must score a 70 or \nhigher to make the shot ", 60, 600 );
        
        
        //Directions For Player 2
       /* gc.fillText("Player 2", 1370, 190);
        gc.strokeText( "Player 2", 1370, 190 );*/
        
        gc.fillText("5. You will have unlimited attempts \nto make as many shots as possible ", 1000, 290);
        gc.strokeText( "5. You will have unlimited attempts \nto make as many shots as possible", 1000, 290 );
        
        gc.fillText("6. Wait 5 seconds and then click try \nagain analyze what you can \nwork on, DONT RUSH IT", 1000, 410);
        gc.strokeText( "6. Wait 5 seconds and then click try \nagain analyze what you can \nwork on, DONT RUSH IT", 1000, 410 );
    
        gc.fillText("7. Orange has a slight chance of \nmaking but also a slight \nchance of missing", 1000, 550);
        gc.strokeText( "7. Orange has a slight chance of \nmaking but also a slight \nchance of missing", 1000, 550 );
        
        
        gc.fillText("8. Red and Blue have a great \nchance of missing", 1000, 690);
        gc.strokeText( "8. Red and Blue have a great \nchance of missing", 1000, 690 );
        
        //Button to Go To Game
        primaryStage.setTitle("Ball On Stites");
        Button btn = new Button();
        btn.setText("Start Game");
        btn.setLayoutX(200);
        btn.setLayoutY(200);
        root.getChildren().add(btn);
        
        Basketball basket = new Basketball();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event)
            {
            	Stage primaryStage = new Stage();
                basket.start(primaryStage);
                Stage stage = (Stage) btn.getScene().getWindow();
                stage.close();
            }
        });
       
        //Disable maximize option on program
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        
        
    }
   
}