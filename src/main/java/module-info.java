module com.robot.robot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.robot.robot to javafx.fxml;
    exports com.robot.robot;
}