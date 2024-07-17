package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "roberto";
        str[1] = "alberta";
        str[2] = "juberti";

        System.out.println(longestCommonPrefix(str));
        System.out.println(str.length);
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx=0;
        while(idx < s1.length() && idx < s2.length()){
            if (s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            }else{
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
