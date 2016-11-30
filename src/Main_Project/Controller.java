package Main_Project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.io.IOException;
import java.awt.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Controller {
    private Scene root;
    private Stage primaryStage;
    @FXML
    private Button loginBtn;
    @FXML
    private Button registerBtn;

    @FXML
    /**
     * Sets action for the next button.
     */
    private void setLoginBtn() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Login2" +
                    ".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("Group 54 Phase 3");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();

    }

}
