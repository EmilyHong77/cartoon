package cartoon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("~ The Mystery of the Missing TA！~");
        primaryStage.show();

    }
}
