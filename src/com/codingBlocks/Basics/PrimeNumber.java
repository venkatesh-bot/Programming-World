package com.codingBlocks.Basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int divisor = 2;
        boolean flag = true;

        while (divisor <= n - 1) {
            if (n % divisor == 0) {
                flag = false;
            }
            divisor = divisor + 1;
        }

        if(flag == true){
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is a non-prime number");
        }
    }
}
