package DesktopApplication;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterWindow {
    private final Stage STAGE_REGISTER;
    private FXMLLoader loader;


    public RegisterWindow(Stage stage) {
        this.STAGE_REGISTER = stage;
    }

    void createRegisterWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/RegisterWindowInterface.fxml"));
            Scene scene = new Scene(loader.load());
            STAGE_REGISTER.setScene(scene);
            STAGE_REGISTER.setTitle("Register to PTTK APP");
            ((RegisterWindowController)loader.getController()).init(STAGE_REGISTER);
            STAGE_REGISTER.setResizable(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
