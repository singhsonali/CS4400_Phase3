package Main_Project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.io.IOException;
import java.awt.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.awt.event.ActionEvent;

public class Controller {
    private Scene root;
    private Stage primaryStage;

    @FXML
    private void setLoginBtn() {


        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("MainPage" +
                    ".fxml"));
            primaryStage = new Stage();
            primaryStage.setTitle("Group 54 Phase 3");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @FXML
    private void setRegistrationBtn() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("NewStudentRegistration.fxml"));
            primaryStage = new Stage();
            primaryStage.setTitle("Group 54 Phase 3");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
