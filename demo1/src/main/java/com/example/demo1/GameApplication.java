package com.example.demo1;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
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

public class GameApplication extends Application{//PLEASE put the opening braces on the top next time NAT >:( ~NS :)
    @Override
    public void start(Stage theStage) throws Exception {

        Button startButton = new Button("START");
        startButton.setMinSize(200, 50);
        // startButton.setStyle("-fx-border-color: black; -fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");

        FileInputStream stream = new FileInputStream("C:\\Users\\lkree\\IdeaProjects\\SOI\\SOIMainScreen.png");
        Image image = new Image(stream);
        ImageView startImage = new ImageView(image);
        startImage.setPreserveRatio(true);
/*
        GridPane resizeLayout = new GridPane();
        resizeLayout.setPadding(new Insets(10, 10, 10, 10));
        resizeLayout.setVgap(5);
        resizeLayout.setHgap(5);
*/
        StackPane layout = new StackPane(startImage, startButton);
        StackPane layout2 = new StackPane();

       // resizeLayout.add(layout, 0, 0);

        Scene scene = new Scene(layout, 1280, 720);
        Scene scene2 = new Scene(layout2, 1280, 720);

        theStage.setTitle("The Sorceress of Isan");
        theStage.setScene(scene);
        theStage.setFullScreen(true);
        theStage.show();

        startButton.setOnAction(e -> {theStage.setScene(scene2); theStage.setFullScreen(true);});
    }

    public static void main(String[] args){
        launch(args);
    }
}