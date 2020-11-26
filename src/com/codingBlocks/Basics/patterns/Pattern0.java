package com.codingBlocks.Basics.patterns;

import java.util.Scanner;

public class Pattern0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            //work
            System.out.print("*");
            //preparation
            System.out.println();
            //System.out.print("\n");
        }

        int row1 = 1;
        while (row1 <= n) {
            //work
            System.out.print("*");
            //preparation
            row1 = row1 + 1;
            System.out.println();
        }
    }
}
