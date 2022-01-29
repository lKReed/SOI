package com.example.demo1;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.event.ActionEvent;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.util.Stack;

public class GameApplication extends Application{
    @Override
    public void start(Stage theStage) throws Exception {

        Button startButton = new Button("START");
        startButton.setMinSize(200, 50);

        TextArea text = new TextArea();

        VBox vBox = new VBox(text);

        FileInputStream stream = new FileInputStream("C:\\Users\\lkree\\IdeaProjects\\SOI\\SOIMainScreen.png");
        Image image = new Image(stream);
        ImageView startImage = new ImageView(image);
        startImage.setPreserveRatio(true);
        StackPane layout = new StackPane(startImage, vBox, startButton);
        StackPane layout2 = new StackPane();

        Scene scene = new Scene(layout, 1280, 720);
        Scene scene2 = new Scene(layout2, 1280, 720);

        theStage.setTitle("The Sorceress of Isan");
        theStage.setScene(scene);
        theStage.setFullScreen(true);
        theStage.show();

        startButton.setOnAction(e -> { System.out.println(text.getText()); });
    }

    public static void main(String[] args){
        launch(args);
    }
}