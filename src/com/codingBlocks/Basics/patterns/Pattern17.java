package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numberOfStars = n / 2;
        int numberOfSpaces = 1;

        // Rows
        int rows = 1;
        while (rows <= n) {
            // Work for stars
            for (int countOfStars = 1; countOfStars <= numberOfStars; countOfStars++) {
                System.out.print("*\t");
            }

            // Work for spaces
            for (int countOfSpaces = 1; countOfSpaces <= numberOfSpaces; countOfSpaces++) {
                System.out.print(" \t");
            }

            // Work for stars
            for (int countOfStars = 1; countOfStars <= numberOfStars; countOfStars++) {
                System.out.print("*\t");
            }

            // preparation
            System.out.println();
            if (rows <= n/2) {
                numberOfSpaces = numberOfSpaces + 2;
                numberOfStars = numberOfStars - 1;
            } else {
                numberOfSpaces = numberOfSpaces - 2;
                numberOfStars = numberOfStars + 1;
            }
            rows = rows + 1;
        }
    }
}
