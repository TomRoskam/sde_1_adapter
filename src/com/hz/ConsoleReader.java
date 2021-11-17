package com.hz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    //function to read input in console.
    public String readLine() {
        try{
            //reading string from console
            String line = (new BufferedReader(
                    new InputStreamReader(System.in))
            ).readLine();
            //return the given input
            return line;
        }
        catch(IOException ex) {
            //if input could not be detected, return this error message.
            return "Gibberish input detected";
        }
    }
}
