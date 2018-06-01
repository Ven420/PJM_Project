package Timerbtn;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class Box extends Boxes
{
   public Box()
   {
      super(new VBox());
   }

   void addTimerButtonV(TimerButton n)
   {
      getVBox().getChildren().add(n.getButton());
      getVBox();
      VBox.setVgrow(n.getButton(), Priority.ALWAYS);
      n.getButton().setMaxHeight(Double.MAX_VALUE);
      n.getButton().setMaxWidth(Double.MAX_VALUE);
      n.getButton().setOnAction(new CloseEvent());
      n.startTime();
   }
   
   void addTimerButtonH(TimerButton n)
   {
      getHBox().getChildren().add(n.getButton());
      getHBox();
      HBox.setHgrow(n.getButton(), Priority.ALWAYS);
      n.getButton().setMaxHeight(Double.MAX_VALUE);
      n.getButton().setMaxWidth(Double.MAX_VALUE);
      n.getButton().setOnAction(new CloseEvent());
      n.startTime();
   }
   
   void addButtonH(Button n)
   {
      
      getHBox().getChildren().add(n);
      getHBox();
      HBox.setHgrow(n, Priority.ALWAYS);
      n.setMaxHeight(Double.MAX_VALUE);
      n.setMaxWidth(Double.MAX_VALUE);
//      n.getButton().setOnAction(new CloseEvent());
//      n.startTime();
   }
   
   void addButtonV(Button n)
   {
      getVBox().getChildren().add(n);
      getVBox();
      VBox.setVgrow(n, Priority.ALWAYS);
      n.setMaxHeight(Double.MAX_VALUE);
      n.setMaxWidth(Double.MAX_VALUE);
      // n.getButton().setOnAction(new CloseEvent());
      // n.startTime();
   }
}
