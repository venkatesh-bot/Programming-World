package com.codingBlocks.Basics;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("loop");
        }
        for (int i = 1; i <= 5; i = i + 1) {
            System.out.println("thera baap");
        }
        int l = 1;
        for (; l <= 5; ) {
            System.out.println("Theri Bahaan");
            l = l + 1;
        }
    }
}
