package DesktopApplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class RegisterWindowController {
    @FXML
    private TextField SurnameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField loginField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField passField;
    @FXML
    private TextField repeatPassField;
    @FXML
    private Button sendBtn;

    public void init(Stage stage) {
    }

    @FXML
    void sendOnMouseClicked(MouseEvent event) {

    }
}
