package com.codingBlocks;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("The given number is : " +input);

        if (input % 2 == 0){
            System.out.println("The given input is even");
        } else {
            System.out.println("The given input is odd");
        }
    }
}
