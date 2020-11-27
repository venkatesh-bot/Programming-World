package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numberOfRows = n * 2 - 1;
        int numberOfStars = 1;

        // rows
        int rows = 1;
        while (rows <= numberOfRows) {
            // work
            int countOfStars = 1;
            while (countOfStars <= numberOfStars) {
                System.out.print("*\t");
                countOfStars++;
            }

            if (rows <= numberOfRows/2) {
                numberOfStars++;
            } else {
                //numberOfStars--;
                numberOfStars = numberOfStars - 1;
            }

            // preparation
            System.out.println();
            rows++;
        }
    }
}
