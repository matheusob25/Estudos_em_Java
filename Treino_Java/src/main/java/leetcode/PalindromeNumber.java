package leetcode;

import java.awt.*;
import java.util.Scanner;

public class PalindromeNumber {
    class Solution{
       public boolean IsPalindrome(int x) {
            String contr = "";
            String j = String.valueOf(x);
           for (int k1 = (j.length() - 1); k1 >= 0; k1--){
               contr += j.charAt(k1);
           }
           System.out.println(contr);
           return j.equals(contr);
        }
    }

    public static void main(String[] args) {
      PalindromeNumber PN = new PalindromeNumber();
        Solution s = PN.new Solution();

//        System.out.println(s.IsPalindrome());

    }
}
