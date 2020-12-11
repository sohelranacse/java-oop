package javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Shape_Example2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        primaryStage.setTitle("Rectangle Example");
        Group group = new Group();
        Rectangle rect = new Rectangle();
        rect.setX(20);
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(100);
        rect.setArcHeight(35);
        rect.setArcWidth(35);
        rect.setFill(Color.RED);
        group.getChildren().addAll(rect);
        Scene scene = new Scene(group, 200, 300, Color.GRAY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
