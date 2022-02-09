package com.example.demo1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

        Font font = Font.font("Times New Roman");

        Button submitB = new Button("Submit");
        Button potionB = new Button("Potion");
        Button hintB = new Button("Hint");
        submitB.setFont(font);
        potionB.setFont(font);
        hintB.setFont(font);

        Label instructions = new Label("Instructions");
        instructions.setFont(font);

        Label hint = new Label("");
        hint.setFont(font);

        Label mana = new Label("3/3 mana");
        mana.setFont(font);

        Label stars = new Label("7 stars");
        stars.setFont(font);

        TextArea code = new TextArea();

        VBox instructionsPotions = new VBox(30, mana, instructions, potionB);
        instructionsPotions.setAlignment(Pos.CENTER_LEFT);
        VBox.setMargin(mana, new Insets(20,20,20,20));
        VBox.setMargin(instructions, new Insets(20,20,20,20));
        VBox.setMargin(potionB, new Insets(20,20,20,20));

        VBox hintBox = new VBox(30, hintB, hint);
        hintBox.setAlignment(Pos.CENTER_RIGHT);
        VBox.setMargin(hintB, new Insets(20,20,20,20));
        VBox.setMargin(stars, new Insets(20,20,20,20));
        VBox.setMargin(hint, new Insets(20,20,20,20));

        VBox codeBox = new VBox(30, stars, code, submitB);
        codeBox.setAlignment(Pos.CENTER);
        HBox.setMargin(code, new Insets(20,20,20,20));
        HBox.setMargin(submitB, new Insets(20,20,20,20));

        HBox layout = new HBox(30, instructionsPotions, codeBox, hintBox);
        layout.setAlignment(Pos.CENTER);
        HBox.setMargin(instructions, new Insets(20,20,20,20));
        HBox.setMargin(codeBox, new Insets(20,20,20,20));
        HBox.setMargin(hintB, new Insets(20,20,20,20));

        // declares stackpanes
        StackPane encounterLayout = new StackPane(layout);

        // scene declaration
        Scene encounterScreen = new Scene(encounterLayout, 1280, 720);

        // sets up the stage in fullscreen and shows it
        theStage.setTitle("The Sorceress of Isan");
        theStage.setScene(encounterScreen);
        theStage.setFullScreen(true);
        theStage.show();

        // button actions
        hintB.setDisable(true);
        submitB.setOnAction(e -> {
            String c = code.getText();
            hintB.setDisable(false);
        });
        hintB.setOnAction (e -> {
            hint.setText("Hint!");
        });
    }

    public static void main(String[] args){
        launch(args);
    }
}