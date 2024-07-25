package com.oocode;

import java.util.Arrays;

public class Answerer {
    public String answerFor(String question) {
        if (question == "What is your name?")
            return "Jack will win this for us";

        else if (question.contains("plus")) {
            var split = question.substring(0, question.length() - 1).split(" ");
            var first = Integer.parseInt(split[2]);
            var second = Integer.parseInt(split[4]);
            var third = Integer.parseInt(split[6]);
            return Integer.toString(first + second + third);
        } else if (question.contains("multiplied by")) {
            var split = question.substring(0, question.length() - 1).split(" ");
            var first = Integer.parseInt(split[2]);
            var second = Integer.parseInt(split[5]);
            return Integer.toString(first * second);

        } else if (question.contains("minus")) {
            var split = question.substring(0, question.length() - 1).split(" ");
            var first = Integer.parseInt(split[2]);
            var second = Integer.parseInt(split[4]);
            return Integer.toString(first - second);

        } else if (question.contains("power of")) {
            var split = question.substring(0, question.length() - 1).split(" ");
            var first = Integer.parseInt(split[2]);
            var second = Integer.parseInt(split[7]);
            return Integer.toString((int) Math.pow(first, second));
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
