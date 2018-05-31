package Timerbtn;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application
{

   @Override
   public void start(Stage primaryStage)
   {
      Box vBox = new Box();
      vBox.addTimerButtonV(new TimerButton(10));
      vBox.addTimerButtonV(new TimerButton(10));
      vBox.addButtonV(new Button());

      Scene scene = new Scene(vBox.getVBox());
      primaryStage.setTitle("Card Layout");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }
}
