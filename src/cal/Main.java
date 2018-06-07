package cal;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application
{

   public static void main(String[] args)
   {
      Application.launch(Main.class, args);
   }

   /**
    * Setzt FXML Datei als Stage Scene.
    */
   @Override
   public void start(Stage stage) throws Exception
   {

      Parent root = FXMLLoader.load(getClass().getResource("calc2.fxml"));
      stage.setTitle("Calculator");
      stage.setScene(new Scene(root, 300, 275));
      stage.show();
   }

}
