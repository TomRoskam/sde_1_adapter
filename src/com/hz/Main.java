package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //make new console writer and answer checker
        ConsoleWriter writer = new ConsoleWriter();
        Adapter checker = new Adapter();

        // question that appears in the console
        String q1 = "Do you like eating vegetables?";

        //answers given after answerChecker
        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        //check if answer is in Array using the answerChecker function
        if (checker.answerChecker()) {
            //output the good string in console.
            writer.write(good);
        } else {
            //output the bad string in console
            writer.write(bad);
        }
    }
}
