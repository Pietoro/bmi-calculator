package pl.pietoro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

public class Controller {

    @FXML
    private TextField txtWeigth;

    @FXML
    private TextField txtHeight;

    @FXML
    private Button btnCalc;

    @FXML
    private Label txtResultBMI;

    @FXML
    private Label txtResultStatus;

    @FXML
    void calculateBMI(ActionEvent event) {


        double heightText = Double.parseDouble(txtHeight.getText());
        double weigthText = Double.parseDouble(txtWeigth.getText());
        // BMI
        Double bmiIndex = weigthText / Math.pow(heightText / 100, 2);

        txtResultBMI.setText(String.format("%5.2f", bmiIndex));
        txtResultStatus.setText(calculateStatus(bmiIndex));
    }

    private String calculateStatus(Double BMI) {
        if (BMI < 18.5) {
            txtResultStatus.setTextFill(Paint.valueOf("#fce271"));
            return Status.UNDERWEIGHT.getStatusDescripttion();
        } else if (BMI < 25) {
            txtResultStatus.setTextFill(Paint.valueOf("#64fc67"));
            return Status.OPTIMUM.getStatusDescripttion();
        } else if (BMI < 30) {
            txtResultStatus.setTextFill(Paint.valueOf("#fce271"));
            return Status.OVERWEIGHT.getStatusDescripttion();
        } else {
            txtResultStatus.setTextFill(Paint.valueOf("#fc88711"));
            return Status.OBESE.getStatusDescripttion();
        }

    }

}
