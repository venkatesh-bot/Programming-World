package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numberOfSpaces = n - 1;
        int numberOfStars = 1;
        // rows
        int rows = 1;
        while (rows <= n) {

            // work for spaces
            int countOfSpaces = 1;
            while (countOfSpaces <= numberOfSpaces) {
                System.out.print(" \t");
                countOfSpaces++;
            }

            // work for stars
            int countOfStars = 1;
            while (countOfStars <= numberOfStars) {
                System.out.print("*\t");
                countOfStars++;
            }

            System.out.println();
            numberOfStars++;
            numberOfSpaces--;
            rows++;
        }
    }
}
