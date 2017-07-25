package com.junk.application;

import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;
import com.junk.application.fxtween.ControlAccessor;
import com.junk.application.fxtween.FXTweenManipulator;
import java.sql.Time;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Elmerhd
 */
public class Test extends Application {
    private TweenManager manager = new TweenManager();
    private FXTweenManipulator manipulator = new FXTweenManipulator();
    @Override
    public void start(Stage primaryStage) {
        manipulator.registerClassAccessors(Control.class, new ControlAccessor(), manager);
        manipulator.setCombineAttrLimits(4);
        manipulator.start();
        
        Button btn1 = new Button("Button1");
        btn1.setOnAction((ActionEvent event) -> {
            Tween.to(btn1, ControlAccessor.POSITION_X, 1f).target(200).start(manager);
        });
        Button btn2 = new Button("Button2");
        btn2.setOnAction((ActionEvent event) -> {
            Timeline.createSequence()
                    .beginParallel()
                        .push(Tween.to(btn2, ControlAccessor.ROTATION, 2f).target(360))
                        .push(Tween.to(btn2, ControlAccessor.POSITION_XY, 2f).target(500,500))
                    .end()
                    .beginSequence()
                    .end()
                    .start(manager);
        });
        
        AnchorPane root = new AnchorPane();
        root.getChildren().add(btn2);
        root.getChildren().add(btn1);
        
        
        Scene scene = new Scene(root, 750, 750);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
