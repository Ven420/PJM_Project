package Timerbtn;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class Box extends Boxes
{
   public Box()
   {
      super(new VBox());
   }

   void addTimerButton(TimerButton n)
   {
      getVBox().getChildren().add(n.getButton());
      getVBox();
      VBox.setVgrow(n.getButton(), Priority.ALWAYS);
      n.getButton().setMaxHeight(Double.MAX_VALUE);
      n.getButton().setMaxWidth(Double.MAX_VALUE);
      n.getButton().setOnAction(new CloseEvent());
      n.startTime();
   }
}
