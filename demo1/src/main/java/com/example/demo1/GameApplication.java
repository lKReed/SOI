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

public class GameApplication extends Application{
    @Override
    public void start(Stage theStage) throws Exception {

        // start button declaration
        Button startButton = new Button("START");
        startButton.setMinSize(200, 50);

        // dialogue button declaration - there is a way to change button text, so we'll likely do that to present dialogue options when we get there
        Button dialogueOption1 = new Button("1");
        Button dialogueOption2 = new Button("2");
        Button next = new Button("Next");

        // start screen background
        FileInputStream stream = new FileInputStream("C:\\Users\\lkree\\IdeaProjects\\SOI\\SOIMainScreen.png");
        Image image = new Image(stream);
        ImageView startImage = new ImageView(image);
        startImage.setPreserveRatio(true);

        // dialogue screen text - need help figuring out files and stuff to pull dialogue from there
        Text text = new Text("Testing testing 123");

        // puts dialogue buttons in a HBox so we can control where they are on the screen
        HBox dialogueButtons = new HBox(30, dialogueOption1, dialogueOption2);
        dialogueButtons.setAlignment(Pos.BOTTOM_CENTER);
        HBox.setMargin(dialogueOption1, new Insets(20,20,20,20));
        HBox.setMargin(dialogueOption2, new Insets(20,20,20,20));

        // puts text in a VBox so we can control where it is on the screen
        VBox dialogue = new VBox(30, text, next);
        dialogue.setAlignment(Pos.CENTER);
        HBox.setMargin(text, new Insets(20,20,20,20));
        HBox.setMargin(next, new Insets(20,20,20,20));

        // declares stackpanes
        StackPane startLayout = new StackPane(startImage, startButton);
        StackPane dialogueLayout = new StackPane(dialogueButtons, dialogue);

        // scene declaration
        Scene startScreen = new Scene(startLayout, 1280, 720);
        Scene dialogueScreen = new Scene(dialogueLayout, 1280, 720);

        // sets up the stage in fullscreen and shows it
        theStage.setTitle("The Sorceress of Isan");
        theStage.setScene(startScreen);
        theStage.setFullScreen(true);
        theStage.show();

        // transitions to dialogue screen when start button is pressed - realistically there will be a scene or two before the dialogue scene, but we'll get there when we get there
        startButton.setOnAction(e -> {theStage.setScene(dialogueScreen); theStage.setFullScreen(true);});
    }

    public static void main(String[] args){
        launch(args);
    }
}