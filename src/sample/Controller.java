package sample;
import com.sun.javafx.scene.layout.region.Margins;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.fxml.Initializable;

import java.awt.*;


public class Controller{
    @FXML
    private TextField xField;
    @FXML
    private TextField aField;
    @FXML
    private TextField bField;
    @FXML
    private Label answerField;

    public void onButtonCalculateClick(){
        int x = Integer.parseInt(xField.getText());
        int a = Integer.parseInt(aField.getText());
        int b = Integer.parseInt(bField.getText());
        double result=0;
        if (x>7)
            result = x * Math.pow((a+b),2);
        else if (!(a==0 & b==0))
            result= (x+4)/(Math.pow(a,2)+Math.pow(b,2));

        answerField.setText(String.valueOf(result));
    }

    public void onButtonClearClick(){
        xField.clear();
        aField.clear();
        bField.clear();
        answerField.setText("");
    }

    public void onButtonCloseClick(){
        System.exit(0);
    }
    
}