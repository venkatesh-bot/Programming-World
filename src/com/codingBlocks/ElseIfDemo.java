package com.codingBlocks;

import java.util.Scanner;

public class ElseIfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age <= 12) {
            System.out.println("He/she is a child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("He/She is a teenager");
        } else if (age >= 20 && age <= 60) {
            System.out.println("He/She is an Adult");
        } else {
            System.out.println("He/She is a senior");
        }
    }
}
