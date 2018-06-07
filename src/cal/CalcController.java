package cal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController implements Initializable
{
   @FXML
   private TextField txtField = new TextField();

   @FXML
   private Button lnButton = new Button();

   @FXML
   private Button sinButton = new Button();

   @FXML
   private Button cosButton = new Button();

   @FXML
   private Button tanButton = new Button();

   @FXML
   private Button signButton = new Button();

   @FXML
   private Button oneXButton = new Button();

   @FXML
   private Button yXButton = new Button();

   @FXML
   private Button sqrButton = new Button();

   @FXML
   private Button lstxButton = new Button();

   @FXML
   private Button xyButton = new Button();

   @FXML
   private Button clrButton = new Button();

   @FXML
   private Button clxButton = new Button();

   @FXML
   private Button sevenButton = new Button();

   @FXML
   private Button eightButton = new Button();

   @FXML
   private Button nineButton = new Button();

   @FXML
   private Button divideButton = new Button();

   @FXML
   private Button fiveButton = new Button();

   @FXML
   private Button sixButton = new Button();

   @FXML
   private Button fourButton = new Button();

   @FXML
   private Button multiplyButton = new Button();

   @FXML
   private Button oneButton = new Button();

   @FXML
   private Button twoButton = new Button();

   @FXML
   private Button threeButton = new Button();

   @FXML
   private Button minusButton = new Button();

   @FXML
   private Button zeroButton = new Button();

   @FXML
   private Button commaButton = new Button();

   @FXML
   private Button enterButton = new Button();

   @FXML
   private Button plusButton = new Button();

   public double x;

   public double y;

   public String selOperator;

   public String selTrigon;

   /**
    * Initialisiert den Controller nachdem die Stage geladen ist.
    */
   @Override
   public void initialize(URL location, ResourceBundle resources)
   {

      txtField.setEditable(false);

      oneButton.setOnAction(e -> {
         txtField.appendText("1");
      });

      twoButton.setOnAction(e -> {
         txtField.appendText("2");
      });

      threeButton.setOnAction(e -> {
         txtField.appendText("3");
      });

      fourButton.setOnAction(e -> {
         txtField.appendText("4");
      });

      fiveButton.setOnAction(e -> {
         txtField.appendText("5");
      });

      sixButton.setOnAction(e -> {
         txtField.appendText("6");
      });

      sevenButton.setOnAction(e -> {
         txtField.appendText("7");
      });

      eightButton.setOnAction(e -> {
         txtField.appendText("8");
      });

      nineButton.setOnAction(e -> {
         txtField.appendText("9");
      });

      zeroButton.setOnAction(e -> {
         txtField.appendText("0");
      });

      signButton.setOnAction(e -> {
         if (txtField.getText().contains("-"))
         {
            txtField.deleteText(0, 1);
         }
         else
         {
            txtField.insertText(0, "-");
         }
      });

      commaButton.setOnAction(e -> {
         if (txtField.getText().contains("."))
         {
            return;
         }
         else
         {
            txtField.appendText(".");
         }
      });

      clrButton.setOnAction(e -> {
         x = 0;
         y = 0;
         txtField.clear();
      });

      plusButton.setOnAction(e -> {
         selOperator = "+";
         txtField.setText(calcOperator(selOperator));
      });

      minusButton.setOnAction(e -> {
         selOperator = "-";
         txtField.setText(calcOperator(selOperator));
      });

      divideButton.setOnAction(e -> {
         selOperator = "/";
         txtField.setText(calcOperator(selOperator));
      });

      multiplyButton.setOnAction(e -> {
         selOperator = "*";
         txtField.setText(calcOperator(selOperator));
      });

      enterButton.setOnAction(e -> {
         if(String.valueOf(x).isEmpty() || String.valueOf(x).contentEquals("0")) {
            x = Double.parseDouble(txtField.getText().toString());
            txtField.clear();
         }else {
            y = Double.parseDouble(txtField.getText().toString());
            txtField.clear();
         }

      });

      sinButton.setOnAction(e -> {
         double input = Double.parseDouble(txtField.getText().toString());
         String selTrigon = "sin";
         txtField.setText(calcTrigonometry(selTrigon, input));
      });

      cosButton.setOnAction(e -> {
         double input = Double.parseDouble(txtField.getText().toString());
         String selTrigon = "cos";
         txtField.setText(calcTrigonometry(selTrigon, input));
      });

      tanButton.setOnAction(e -> {
         double input = Double.parseDouble(txtField.getText().toString());
         String selTrigon = "tan";
         txtField.setText(calcTrigonometry(selTrigon, input));
      });
      
      lnButton.setOnAction(e -> {
         double input = Double.parseDouble(txtField.getText().toString());
         String selTrigon = "ln";
         txtField.setText(calcTrigonometry(selTrigon, input));
      });
   }

   public String calcOperator(String operator)
   {
      switch (operator)
      {
         case "+":
            double tmp1 = x + y;
            return String.valueOf(tmp1);
         case "-":
            double tmp2 = x - y;
            return String.valueOf(tmp2);
         case "*":
            double tmp3 = x * y;
            return String.valueOf(tmp3);
         case "/":
            double tmp4 = x / y;
            return String.valueOf(tmp4);
         default:
      }
      return String.valueOf(x);
   }

   public String calcTrigonometry(String trigo, double left)
   {
      switch (trigo)
      {
         case "sin":
            double tmp = Math.sin(left);
            return String.valueOf(tmp);
         case "cos":
            double tmp2 = Math.cos(left);
            return String.valueOf(tmp2);
         case "tan":
            double tmp3 = Math.tan(left);
            return String.valueOf(tmp3);
         case "ln":
            double tmp4 = Math.log(left);
            return String.valueOf(tmp4);
         default:
      }
      return String.valueOf(left);
   }
}