package src.io_ThreadChallenge2;

import javafx.scene.control.TextFormatter;

import java.io.*;

public class ChangeFileController {

    public static void main(String[] args) {

        String readFrom ="/Users/kevinneag/Downloads/massprez.csv" ;

        String writeTo = "/Users/kevinneag/Downloads/";


        ChangeFile copy = new ChangeFile("First_Copy",readFrom, writeTo+"1.csv" );
        ChangeFile copy2 = new ChangeFile("Second_Copy", readFrom, writeTo+"2.csv");

        ChangeFile copy3 = new ChangeFile("Third_Copy",readFrom, writeTo+"3.csv" );

        ChangeFile copy4 = new ChangeFile("Fourth_Copy", readFrom, writeTo+"4.csv");
        ChangeFile copy5 = new ChangeFile("Fifth_Copy", readFrom, writeTo+"5.csv");

        System.out.println("Copying Complete");




    }
}