package com.codingBlocks.Basics;

public class SimpleInterest {

    public static void main(String[] args) {
        int principal = 1000;
        int rate = 5;
        int time = 2; // In years

        int simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest is " + simpleInterest);
    }
}
