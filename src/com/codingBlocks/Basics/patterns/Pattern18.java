package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numberOfSpaces = n / 2;
        int numberOfStars = 1;

        // Rows
        int rows = 1;
        while (rows <= n) {
            // Work for spaces
            for (int countOfSpaces = 1; countOfSpaces <= numberOfSpaces; countOfSpaces++) {
                System.out.print(" \t");
            }

            // Work for stars
            for (int countOfStars = 1; countOfStars <= numberOfStars; countOfStars++) {
                System.out.print("*\t");
            }

            // Preparation
            System.out.println();
            if (rows <= n / 2) {
                numberOfSpaces = numberOfSpaces - 1;
                numberOfStars = numberOfStars + 2;
            } else {
                numberOfSpaces = numberOfSpaces + 1;
                numberOfStars = numberOfStars - 2;
            }
            rows++;
        }
    }
}
