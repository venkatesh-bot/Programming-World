package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numberOfStars = 1;

        // rows
        int row = 1;
        while (row <= n) {

            // work
            int countOfStars = 1;
            while (countOfStars <= numberOfStars) {
                System.out.print("*\t");
                countOfStars++;
            }

            // Preparation
            System.out.println();
            numberOfStars++;
            row++;
        }
    }
}
