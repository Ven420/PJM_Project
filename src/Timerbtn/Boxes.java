package Timerbtn;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Boxes
{

   private HBox hBox;
   private VBox vBox;

   public Boxes(HBox hb)
   {
      this.hBox = hb;
   }
   
   public Boxes(VBox vb)
   {
      this.vBox = vb;
   }
   
   public HBox getHBox()
   {
      return hBox;
   }
   
   public VBox getVBox()
   {
      return vBox;
   } 
}
