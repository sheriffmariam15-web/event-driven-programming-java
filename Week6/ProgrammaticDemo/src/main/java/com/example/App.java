package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label titleLabel =
                new Label("My First JavaFX App");

        Button clickButton =
                new Button("Click Me!");

        clickButton.setOnAction(e -> {

            titleLabel.setText(
                    "Button was clicked!"
            );

            System.out.println(
                    "Button clicked on: "
                            + Thread.currentThread().getName()
            );
        });

        VBox root = new VBox(15);

        root.getChildren().addAll(
                titleLabel,
                clickButton
        );

        root.setStyle(
                "-fx-alignment:center;"
                + "-fx-padding:20px;"
                + "-fx-background-color:#f0f0f0;"
        );

        Scene scene =
                new Scene(root, 400, 300);

        primaryStage.setTitle(
                "JavaFX Programmatic App"
        );

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}