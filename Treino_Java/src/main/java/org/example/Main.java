package org.example;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;


public class Main {
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }

            long reversed = 0;
            long temp = x;

            while (temp != 0) {
                int digit = (int) (temp % 10);
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            return (reversed == x);
        }
    }


    public static void main(String[] args) {
        Main m = new Main();
        Solution s = m.new Solution();
        System.out.println(s.isPalindrome(242));

    }
}