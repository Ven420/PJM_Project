package Timerbtn;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.util.Duration;

public class TimerButton extends Buttons
{
   static Integer timerSec = 10;

   public TimerButton()
   {
      super(new Button("Countdown: "+ timerSec.toString()));

   }

   public KeyFrame getFrame()
   {
      KeyFrame frame = new KeyFrame(Duration.seconds(1),
            new EventHandler<ActionEvent>()
            {
               @Override
               public void handle(ActionEvent event)
               {                
                  timerSec--;
                  getButton().setText("Countdown: " + timerSec.toString());
                  if (timerSec <= 0)
                  {
                     Platform.exit();
                  }
               }
            });
      return frame;
   }

   public void startTime()
   {
      Timeline timeLine = new Timeline();
      timeLine.setCycleCount(Timeline.INDEFINITE);
      timeLine.getKeyFrames().add(getFrame());
      if (timeLine != null)
      {
         timeLine.stop();
      }
      timeLine.play();
   }
}