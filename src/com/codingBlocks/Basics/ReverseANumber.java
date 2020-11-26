package com.codingBlocks.Basics;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;

        while (n != 0) {
            int reminder = n % 10;
            answer = answer * 10 + reminder;
            n = n / 10;
        }
        System.out.println(answer);
    }
}
