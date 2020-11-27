package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        // Input of number
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numberOfStars = n;

        // rows
        int row = 1;
        while (row <= n) {

            // work
            int countOfStars = 1;
            while (countOfStars <= numberOfStars) {
                System.out.print("*\t");
                countOfStars++;
            }

            // preparation
            System.out.println();
            numberOfStars--;
            row++;
        }
    }
}
