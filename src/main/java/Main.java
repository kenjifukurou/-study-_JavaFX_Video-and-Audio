import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        // how to get the file path
//        Image image = new Image("z-p-15.jpg");
//        System.out.println("image = " + image);
//        System.out.println("image path = " + image.getUrl());
//
//        ImageView iv = new ImageView(image);
//
//        String pathToImageGetFile = getClass().getResource("z-p-32.jpg").getFile();
//        String pathToImageToString = getClass().getResource("z-p-32.jpg").toString();
//        System.out.println("pathToImage-GetFile() = " + pathToImageGetFile);
//        System.out.println("pathToImage-ToString() = " + pathToImageToString);
//
//        Image image2 = new Image(pathToImageToString);
//        ImageView iv2 = new ImageView(image2);

        System.out.println("------------------------------------------------");

        Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//        root.getChildren().add(iv2);

        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add("style.css");

        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
