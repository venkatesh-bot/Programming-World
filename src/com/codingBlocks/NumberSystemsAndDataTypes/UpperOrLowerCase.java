package com.codingBlocks.NumberSystemsAndDataTypes;

import java.util.Scanner;

public class UpperOrLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if (ch >= 97 && ch <= 122) {
            System.out.println("Lower Case");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("Upper Case");
        } else {
            System.out.println("Invalid Character");
        }
    }
}
