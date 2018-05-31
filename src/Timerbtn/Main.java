package Timerbtn;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

   @Override
   public void start(Stage primaryStage)
   {
      Box hBox = new Box();
      hBox.addTimerButton(new TimerButton(10));
      hBox.addTimerButton(new TimerButton(10));

      Scene scene = new Scene(hBox.getVBox());
      primaryStage.setTitle("Card Layout");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }
}
