package com.codingBlocks.numberSystemsAndDataTypes;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int fahrenheit = scanner.nextInt();
        int celsius = (fahrenheit-32) * 5/9;
        System.out.println(celsius);*/

        int fmin = 0;
        int fmax = 300;
        int fstep = 20;
        int fcurrent = fmin;
        while (fcurrent <= fmax) {
            int celsius = (int) ((5.0 / 9) * (fcurrent - 32));
            System.out.println(fcurrent + "\t" + celsius);
            fcurrent = fcurrent + fstep;
        }
    }
}
