package pjm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application
{

   @Override
   public void start(Stage primaryStage)
   {
      BorderPane root = new BorderPane();

      Scene scene = new Scene(root);
      primaryStage.setTitle("Card Layout");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }
}
