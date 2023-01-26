package DesktopApplication;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow {
    private final Stage STAGE_MAIN;
    private FXMLLoader loader;


    public MainWindow(Stage stage) {
        this.STAGE_MAIN = stage;
    }

    void createMainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MainWindowInterface.fxml"));
            Scene scene = new Scene(loader.load());
            STAGE_MAIN.setScene(scene);
            STAGE_MAIN.setTitle("PTTK APP - admin panel");
            ((MainWindowController)loader.getController()).init(STAGE_MAIN);
            STAGE_MAIN.setResizable(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
