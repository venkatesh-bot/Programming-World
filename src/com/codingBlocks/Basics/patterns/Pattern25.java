package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numberOfSpaces = n-1;
        int numberOfStars = 1;
        int value = 1;

        //row
        int row = 1;
        while (row <= n) {
            // work for spaces
            for (int countOfSpaces = 1; countOfSpaces <= numberOfSpaces; countOfSpaces++) {
                System.out.print(" \t");
            }

            // work for stars
            for (int countOfStars = 1; countOfStars <= numberOfStars; countOfStars++) {
                System.out.print(value + "\t");
                value++;
            }

            // preparation
            System.out.println();
            numberOfSpaces = numberOfSpaces - 1;
            numberOfStars = numberOfStars + 2;
            row++;
        }
    }
}

