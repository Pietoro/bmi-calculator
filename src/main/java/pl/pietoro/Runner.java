package pl.pietoro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Runner extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("/view.fxml"));
        stage.setTitle("BMI Index Calculator");
        stage.setScene(new Scene(parent));
        stage.show();
        parent.requestFocus();
    }

    public static void main(String[] args) {
        launch();
    }
}
