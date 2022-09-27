package passcode;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author FreedomL
 */
public class PassCode extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text btn = new Text();
        btn.setText(getHex());

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("PassCode");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static String getHex() {
        Long number;
        try {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyHHmm");
            String strDate = formatter.format(date);
            System.out.println("STRING DATE: " + strDate);
            number = Long.valueOf(strDate);
            return Long.toHexString(number).toUpperCase();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
