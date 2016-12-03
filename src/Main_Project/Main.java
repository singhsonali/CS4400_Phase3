package Main_Project;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    /**
     Stage.
     */
    public static Stage stage;

    /**
     Config 1 scene.
     */
    private Scene loginScene;
    private Scene mainPageScene;
    private Scene newStudentRegistrationScene;

    private final static Main main
            = new Main();

    public static Stage getInstance() {
        return stage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Group 54 Phase 3");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
