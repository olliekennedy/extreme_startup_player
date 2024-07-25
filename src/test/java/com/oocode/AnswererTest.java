package com.oocode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnswererTest {
    @Test
    public void canAnswerMyName() {
        var contents = new Answerer().answerFor("What is your name?");

        assertThat(contents, equalTo("Jack will win this for us"));
    }
//
//    @Test
//    public void findLargestNumber(){
//        String value = "q=Which+of+the+following+numbers+is+the+largest:+19,+57,+27%3F";
//        value = value.split("%")[0];
//        String[] split = value.split(":");
//        String[] splitNumbers = split[1].split(",");
//
//        System.out.println("splitNumbers = " + Arrays.stream(splitNumbers).forEach(Integer(it)););
//    }

    @Test
    void findSumOfNumbers() {
        var contents = new Answerer().answerFor("What is 24 plus 23 plus 2?");

        assertThat(contents, equalTo("49"));
    }

    @Test
    void findTripleSumOfNumbers() {
        var contents = new Answerer().answerFor("What is 5 plus 11 plus 72?");

        assertThat(contents, equalTo("88"));
    }


    @Test
    void findMinusNumbers() {
        var contents = new Answerer().answerFor("What is 96 minus 19?");

        assertThat(contents, equalTo("77"));
    }

    @Test
    void findMultiplicationOfNumbers() {
        var contents = new Answerer().answerFor("What is 87 multiplied by 97?");

        assertThat(contents, equalTo("8439"));
    }

    @Test
    void findMultiplicationThenAdditionOfNumbers() {
        var contents = new Answerer().answerFor("What is 74 multiplied by 83 plus 6?");

        assertThat(contents, equalTo("6148"));
    }

    @Test
    void findPowerOfNumbers() {
        var contents = new Answerer().answerFor("What is 2 to the power of 4?");

        assertThat(contents, equalTo("16"));
    }

//    @Test
//    void whichArePrimes() {
//        var contents = new Answerer().answerFor("Which of the following numbers are primes: 3, 7, 4, 94, 39?");
//
//        assertThat(contents, equalTo("3, 7"));
//    }
}
