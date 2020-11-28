package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numberOfStars = 1;
        int numberOfSpaces = 2 * n - 3;

        // Rows
        int rows = 1;
        while (rows <= n) {
            // Work for Stars
            for (int countOfStars = 1; countOfStars <= numberOfStars; countOfStars++) {
                System.out.print("*\t");
            }

            // Work for Spaces
            for (int countOfSpaces = 1; countOfSpaces <= numberOfSpaces; countOfSpaces++) {
                System.out.print(" \t");
            }

            // Work for Stars
            int countOfStars = 1;
            if (rows == n) {
                countOfStars = 2;
            }
            for (; countOfStars <= numberOfStars; countOfStars++) {
                System.out.print("*\t");
            }

            // preparation
            System.out.println();
            numberOfStars = numberOfStars + 1;
            numberOfSpaces = numberOfSpaces - 2;
            rows++;
        }
    }
}
