package com.codingBlocks;

public class SimpleInterest {

    public static void main(String[] args) {
        int principal = 1000;
        int rat = 5;
        int time = 2; // In years

        int simpleInterest = (principal * rat * time) / 100;

        System.out.println("Simple Interest is " + simpleInterest);
    }
}
