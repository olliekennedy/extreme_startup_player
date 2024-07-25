package com.oocode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnswererTest {
//    @Test
//    public void canAnswerMyName() {
//        var contents = new Answerer().answerFor("Which of the following numbers is the largest: 19, 57, 27");
//
//        assertThat(contents, equalTo("57"));
//    }
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
        var contents = new Answerer().answerFor("What is 24 plus 23");

        assertThat(contents, equalTo("47"));
    }

    @Test
    void findSumOfNumbersAnother() {
        var contents = new Answerer().answerFor("What is 2 plus 84");

        assertThat(contents, equalTo("86"));
    }

    @Test
    void findMultiplicationOfNumbers() {
        var contents = new Answerer().answerFor("What is 87 multiplied by 97");

        assertThat(contents, equalTo("8439"));
    }
}
