package Main_Project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.awt.*;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.awt.event.ActionEvent;

public class Controller {
    private Scene root;
    public Stage primaryStage = new Stage();

    @FXML
    private Button loginBtn;

    @FXML
    private Button registerBtn;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Text invalidMsg;
    @FXML
    private Text invalidUsername;
    @FXML
    private Text invalidPassword;


    @FXML
    private void setLoginBtn() {
        System.out.println(username);
        if (username == null || username.getText().trim().isEmpty()) {
            if (password != null || !password.getText().trim().isEmpty()) {
                invalidPassword.setVisible(false);
            }
            System.out.println("No username entered.");
//            username.setText("Please fill in a username!");
            invalidUsername.setVisible(true);
         }

        else if (password == null || password.getText().trim().isEmpty()) {
            if (username != null || !username.getText().trim().isEmpty()){
                invalidUsername.setVisible(false);
            }
            System.out.println("No password entered.");
//            password.setText("Please fill in a password!");
            invalidPassword.setVisible(true);
        } else {
            invalidUsername.setVisible(false);
            invalidPassword.setVisible(false);
            //CHECK HERE FOR VALID LOG IN CREDENTIALS
            boolean isValid = true;
            if (isValid) {
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("MainPage" +
                            ".fxml"));
                    primaryStage.setTitle("Group 54 Phase 3");
                    primaryStage.setScene(new Scene(root));
                    primaryStage.show();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                invalidMsg.setVisible(true);
            }

        }


    }

    @FXML
    private void setRegistrationBtn() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("NewStudentRegistration.fxml"));
            primaryStage.setTitle("Group 54 Phase 3");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    @FXML
//    private void setAddCategory() {
//        Parent root = null;
//        try {
//            root = FXMLLoader.load(getClass().getResource("category.fxml"));
//            primaryStage = new Stage();
//            primaryStage.setTitle("Group 54 Phase 3");
//            primaryStage.setScene(new Scene(root, 700, 500));
//            primaryStage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

        @FXML
    private void setMe() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Me.fxml"));
            primaryStage = new Stage();
            primaryStage.setTitle("Group 54 Phase 3");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void setEditProfile() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("EditProfile.fxml"));
            primaryStage = new Stage();
            primaryStage.setTitle("Group 54 Phase 3");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void setMyApplication() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("MyApplication" +
                    ".fxml"));
            primaryStage = new Stage();
            primaryStage.setTitle("Group 54 Phase 3");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
