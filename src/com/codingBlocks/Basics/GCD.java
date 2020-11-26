package com.codingBlocks.Basics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter dividend : ");
        int dividend = scanner.nextInt();
        System.out.println("please enter divisor : ");
        int divisor = scanner.nextInt();

        while (dividend % divisor != 0) {
            int reminder = dividend % divisor;
            dividend = divisor;
            divisor = reminder;
        }
        System.out.println("GCD : " + divisor);
    }
}
