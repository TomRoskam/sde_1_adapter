package com.hz;

public class Adapter {

    public static Boolean answerChecker() {

        //TODO
        // the reader should accept the following values as true:
        // "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"

        //making a new console reader, so the adapter can read what is said in the console.
        ConsoleReader reader = new ConsoleReader();

        //values to check
        String[] values = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

        //set boolean
        Boolean ans1 = false;

        //make variable of value that needs to be checked
        String searchedValue = reader.readLine();

        //loop through array of values which need to be good.
        for (String x : values) {
            if (x.equals(searchedValue)) {
                //Convert answer to a Boolean.
                ans1 = true;
                //if answer found in Array, break out of loop.
                break;
            } else if (!x.equals(searchedValue)) {
                //Convert answer to a Boolean.
                ans1 = false;
            }
        }
        //return answer to main program
        return ans1;
    }
}
