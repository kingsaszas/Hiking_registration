package DesktopApplication;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginWindowController {
    @FXML
    private Pane Pane;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField loginField;
    @FXML
    private Label loginLabel;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label passwordLabel;
    @FXML
    private Label pttLabel;

    private Stage stage_register = new Stage();
    RegisterWindow registerWindow = new RegisterWindow(stage_register);

    private Stage stage_main = new Stage();
    MainWindow mainWindow = new MainWindow(stage_main);

    public void init(Stage stage) {
        registerWindow.createRegisterWindow();
        mainWindow.createMainWindow();
    }


    @FXML
    void onMouseClickedLogIn(MouseEvent event) {
        stage_main.show();
    }

    @FXML
    void onMouseClickedCreateAccount(MouseEvent event) {
        stage_register.show();

    }


}
