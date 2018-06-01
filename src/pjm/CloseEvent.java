package Timerbtn;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CloseEvent implements EventHandler<ActionEvent>
{

   public CloseEvent()
   {

   }

   @Override
   public void handle(ActionEvent arg0)
   {
      Platform.exit();
      
   }

}
