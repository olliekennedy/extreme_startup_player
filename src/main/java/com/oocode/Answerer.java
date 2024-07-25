package com.oocode;

public class Answerer {
    public String answerFor(String question) {
        if(question == "What is your name?")
        return "Jack will win this for us";

        else if(question.contains("plus")) {
            var split = question.substring(0, question.length() - 1).split(" ");
            var first = Integer.parseInt(split[2]);
            var second = Integer.parseInt(split[4]);
            return Integer.toString(first + second);
        }

        else if(question.contains("multiplied by")) {
            var split = question.substring(0, question.length() - 1).split(" ");
            var first = Integer.parseInt(split[2]);
            var second = Integer.parseInt(split[5]);
            return Integer.toString(first * second);

        }
        else if(question.contains("power of")) {
            var split = question.substring(0, question.length() - 1).split(" ");
            var first = Integer.parseInt(split[2]);
            var second = Integer.parseInt(split[7]);
            return Integer.toString((int)Math.pow(first, second));

        } else {
            return "foo";
        }
    }
}
