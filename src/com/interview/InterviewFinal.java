package com.interview;

public class InterviewFinal {
    public static void main(String[] args) {
        String s1 = "qkshay";
        String s2 = "aksha";

        boolean result = compareStrings(s1, s2);
        System.out.println(result);
    }

    public static boolean compareStrings(String s1, String s2) {

        int m = s1.length(), n = s2.length();

        if (Math.abs(m - n) > 1) {
            return false;
        }
        int count = 0;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (s1.charAt(i) != s2.charAt(j)) {
                //char ch1 = s1.charAt(i);
                //char ch2 = s2.charAt(j);
                if (count == 1) {
                    return false;
                }

                if (m > n) {
                    i++;
                } else if (m < n) {
                    j++;
                } else {
                    i++;
                    j++;
                }
                count++;
            } else {
                i++;
                j++;
            }
        }

        if (i < m || j < n) {
            count++;
        }
        return count == 1;
    }
}
