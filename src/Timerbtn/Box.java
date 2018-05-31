package Timerbtn;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class Box extends Boxes
{
   public Box()
   {
      super(new HBox());
   }

   void addTimerButton(TimerButton n)
   {
      getHBox().getChildren().add(n.getButton());
      getHBox();
      HBox.setHgrow(n.getButton(), Priority.ALWAYS);
      n.getButton().setMaxHeight(Double.MAX_VALUE);
      n.getButton().setMaxWidth(Double.MAX_VALUE);
      n.getButton().setOnAction(new CloseEvent());
      n.startTime();
   }
}
