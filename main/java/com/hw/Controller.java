package com.hw;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField weightField;
    @FXML
    private TextField heightField;
    @FXML
    private Label resultLabel;
    @FXML
    private Label statusLabel;

    public void setLabels(TextField weightField, TextField heightField, Label resultLabel, Label statusLabel) {
        this.weightField = weightField;
        this.heightField = heightField;
        this.resultLabel = resultLabel;
        this.statusLabel = statusLabel;
    }

    public void calculateBMI() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());
            double bmi = weight / (height * height);
            resultLabel.setText(String.format("Your BMI is %.2f", bmi));
            if (bmi < 18.5) {
                statusLabel.setText("Underweight");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statusLabel.setText("Normal");
            } else if (bmi >= 25 && bmi <= 30) {
                statusLabel.setText("Overweight");
            } else {
                statusLabel.setText("Obese");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Введите корректные значения веса и роста.");
            statusLabel.setText("");
        }
    }
}