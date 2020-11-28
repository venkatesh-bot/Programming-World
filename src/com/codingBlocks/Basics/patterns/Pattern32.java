package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numberOfStars = 1;
        int numberOfRows = 2 * n - 1;
        int value;

        // rows
        int row = 1;
        while (row <= numberOfRows) {
            if (row <= numberOfRows / 2 + 1) {
                value = row;
            } else {
                value = numberOfRows - row + 1;
            }

            // work for stars
            for (int countOfStars = 1; countOfStars <= numberOfStars; countOfStars++) {
                if (countOfStars % 2 == 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print(value + "\t");
                }
            }

            // preparation
            System.out.println();
            if (row <= numberOfRows / 2) {
                numberOfStars += 2;
            } else {
                numberOfStars -= 2;
            }

            row++;
        }
    }
}
