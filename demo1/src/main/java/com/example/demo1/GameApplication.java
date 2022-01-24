package com.example.demo1;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
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

import java.util.Stack;

public class GameApplication extends Application{//PLEASE put the opening braces on the top next time NAT >:( ~NS :)
    @Override
    public void start(Stage theStage){
        Button startButton = new Button("Start");
        startButton.setLayoutX(100);
        startButton.setLayoutY(80);
        Text startText = new Text("START HERE PLAYER");
        startText.setLayoutX(500);
        startText.setLayoutY(353);
        Image startImagePNG = new Image( "SOIMainScreen.png" );
        ImageView startImage = new ImageView(startImagePNG);
        TextField startTextField = new TextField();
        startTextField.setEditable(true);


        //Button Action
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                startButton.setText("THIS BUTTON IS PRESSED");
            }
        });


        HBox textAndButton = new HBox();
        textAndButton.getChildren().addAll(startButton , startText, startTextField);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(startImage, textAndButton);

        Group root = new Group(stackPane);

        theStage.setTitle( "The Sorceress of Isan" );
        Scene theScene = new Scene(root);

        theStage.setScene(theScene);

        theStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}