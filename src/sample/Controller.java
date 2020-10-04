package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {
    public Button minus;
    public Button div;
    public Button plus;
    public Button mult;

    public TextField field1;
    public TextField field2;
    public Label label;
    public Button sqrt;
    public Button fact;
    public Button deg;
    public Button rev;


    public void startM(ActionEvent actionEvent) {
        String str1=field1.getText();
        String str2=field2.getText();
        try {
            double first = Double.parseDouble(str1);
            double second = Double.parseDouble(str2);
            label.setText(String.valueOf(first - second));
        }
        catch (NumberFormatException f){
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Неверный ввод");
        }
    }
    public void startP(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            double first = Double.parseDouble(str1);
            double second = Double.parseDouble(str2);
            label.setText(String.valueOf(first + second));
        } catch (NumberFormatException a) {
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Неверный ввод");
        }
    }
    public void startD(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            double first = Double.parseDouble(str1);
            double second = Double.parseDouble(str2);
            label.setText(String.valueOf(first / second));
        } catch (NumberFormatException a) {
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Неверный ввод");
        }
    }
    public void startMult(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            double first = Double.parseDouble(str1);
            double second = Double.parseDouble(str2);
            label.setText(String.valueOf(first * second));
        } catch (NumberFormatException a) {
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Неверный ввод");
        }
    }
    public void startFact (ActionEvent actionEvent) {
        String str1 = field1.getText();
        try {
            double first = Double.parseDouble(str1);
            int res=1;
            for (int i = 1; i <=first ; i++) {
                res=res*i;
            }
            label.setText(String.valueOf(res));
        } catch (NumberFormatException a) {
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Неверный ввод");
        }
        catch (ArithmeticException d){
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Oh");
        }
    }
    public void startSqrt (ActionEvent actionEvent) {
        String str1 = field1.getText();
        try {
            double first = Double.parseDouble(str1);
            label.setText(String.valueOf(Math.sqrt(first)));
        } catch (NumberFormatException a) {
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Неверный ввод");
        }
        catch (ArithmeticException d){
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Oh");
        }
    }
    public void startDeg (ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2=field2.getText();
        try {
            double first =Double.parseDouble(str1);
            double second = Double.parseDouble(str2);

            label.setText(String.valueOf(Math.pow(first,second)));
        } catch (NumberFormatException a) {
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Неверный ввод");
        }
        catch (ArithmeticException d){
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Oh");
        }
    }
    public void startRev (ActionEvent actionEvent) {
        String str1 = field1.getText();
        try {
            double first = Double.parseDouble(str1);
            label.setText(String.valueOf(1/first));
        } catch (NumberFormatException a) {
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Неверный ввод");
        }
        catch (ArithmeticException d){
            label.setTextFill(Color.web("#b82c17"));
            label.setText("Oh");
        }
    }
}