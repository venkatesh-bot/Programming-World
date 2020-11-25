package com.codingBlocks;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= n) {
            sum = sum + counter;
            System.out.println(sum);
            counter = counter + 1;
        }
    }
}
