package com.oocode;

import java.math.BigInteger;

public class Answerer {
    public String answerFor(String question) {
        String[] words = question.substring(0, question.length() - 1).split(" ");

        if (question.matches("^What is your name\\?$")) {
            return "Jack will win this for us";
        }

        if (question.matches("^What is \\d+ plus \\d+\\?$")) {
            return sumOf(words[2], words[4]);
        }

        if (question.matches("^What is \\d+ multiplied by \\d+\\?$")) {
            return Integer.toString(Integer.parseInt(words[2]) * Integer.parseInt(words[5]));
        }

        if (question.matches("^What is \\d+ minus \\d+\\?$")) {
            return Integer.toString(Integer.parseInt(words[2]) - Integer.parseInt(words[4]));
        }

        if (question.matches("^What is \\d+ multiplied by \\d+ plus \\d+\\?$")) {
            return Integer.toString(((Integer.parseInt(words[2]) * Integer.parseInt(words[5])) + Integer.parseInt(words[7])));
        }

        if (question.matches("^What is \\d+ plus \\d+ multiplied by \\d+\\?$")) {
            return Integer.toString((Integer.parseInt(words[2]) + (Integer.parseInt(words[4]) * Integer.parseInt(words[7]))));
        }

        if (question.matches("^What is \\d+ plus \\d+ plus \\d+\\?$")) {
            return sumOf(words[2], words[4], words[6]);
        }

        if (question.matches("^What is \\d+ to the power of \\d+\\?$")) {
            return new BigInteger(words[2]).pow(Integer.parseInt(words[7])).toString();
        }

        return "foo";
    }

    private String sumOf(String... numbers) {
        int accumulator = 0;
        for (String number : numbers) {
            accumulator += Integer.parseInt(number);
        }
        return Integer.toString(accumulator);
    }
}
