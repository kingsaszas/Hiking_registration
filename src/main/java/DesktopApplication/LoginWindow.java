package DesktopApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginWindow extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/LoginWindowInterface.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("PTTK APP");
        ((LoginWindowController)loader.getController()).init(stage);
        stage.setResizable(false);
        stage.show();
    }

    public void run() {
        launch();
    }
}
