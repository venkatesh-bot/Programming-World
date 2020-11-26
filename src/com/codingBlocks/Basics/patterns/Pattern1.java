package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int row = 1;
        while (row <= n) {
            // work
            int times = 1;
            while (times <= n) {
                System.out.print("*\t");
                times = times +1;
            }
            // preparation
            row = row + 1;
            System.out.println();
        }
    }
}
