module com.example.bmi_calc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hw to javafx.fxml;
    exports com.hw;
}