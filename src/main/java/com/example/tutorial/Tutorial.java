package com.example.tutorial;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;


public class Tutorial extends Application  {
    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");

        TilePane layout = new TilePane(button1, button2, button3, button4);

        Scene scene = new Scene(layout, 350, 250);

        primaryStage.setTitle("Tilepane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}