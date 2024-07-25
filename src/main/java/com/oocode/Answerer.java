package com.oocode;

import java.math.BigInteger;
import java.util.Arrays;

interface Do {
    Object apply(Object input);
}

class None implements Do {
    @Override
    public Object apply(Object input) {
        return input;
    }
}
class Str implements Do {
    private final String s;

    public Str(String s) {
        this.s = s;
    }

    @Override
    public Object apply(Object input) {
        return s;
    }
}

public class Answerer {
    public String answerFor(String question) {
        String[] listOfWords = question.substring(0, question.length() - 1).split(" ");

        if (listOfWords.length > 6 && listOfWords[3].equals("multiplied") && listOfWords[6].equals("plus")) {
            return Integer.toString(((Integer.parseInt(listOfWords[2]) * Integer.parseInt(listOfWords[5])) + Integer.parseInt(listOfWords[7])));
        }

        if (listOfWords.length > 6 && listOfWords[3].equals("plus") && listOfWords[5].equals("multiplied")) {
            return Integer.toString((Integer.parseInt(listOfWords[2]) + (Integer.parseInt(listOfWords[4]) * Integer.parseInt(listOfWords[7]))));
        }
//        Arrays.stream(question.split(" ")).map(s -> {
//            switch (s) {
//                case "What":
//                case "is":
//                case "your":
//                    return new None();
//                case "name?":
//                    return new Str("Jack will win this for us");
//                default:
//                    return new None();
//            }
//        });
        if (question == "What is your name?")
            return "Jack will win this for us";

        else {

            if (question.contains("plus")) {
                var split = listOfWords;
                var first = Integer.parseInt(split[2]);
                var second = Integer.parseInt(split[4]);
                var third = Integer.parseInt(split[6]);
                return Integer.toString(first + second + third);
            } else if (question.contains("multiplied by")) {
                var split = listOfWords;
                var first = Integer.parseInt(split[2]);
                var second = Integer.parseInt(split[5]);
                return Integer.toString(first * second);

            } else if (question.contains("minus")) {
                var split = listOfWords;
                var first = Integer.parseInt(split[2]);
                var second = Integer.parseInt(split[4]);
                return Integer.toString(first - second);

            } else if (question.contains("power of")) {
                var split = listOfWords;
                var first = new BigInteger(split[2]);
                var second = Integer.parseInt(split[7]);
                return first.pow(second).toString();
    //        else if(question.contains("following numbers are primes")) {
    //            String[] numbersString = Arrays.stream(question
    //                    .substring(0, question.length() - 1)
    //                    .split(": ")[1]
    //                    .split(", ")).toArray();


            } else {
                return "foo";
            }
        }
    }
}
