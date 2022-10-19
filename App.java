package lab4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
       stage.setTitle("My Stage");
       stage.show();
       PaneOrganizer organizer = new PaneOrganizer();
       Scene scene = new Scene(organizer.getRoot(), Constants.SCENE_WIDTH, Constants.SCENE_HEIGHT);
       stage.setScene(scene);
    }


}