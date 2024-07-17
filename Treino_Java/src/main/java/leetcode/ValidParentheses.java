package leetcode;

import java.awt.desktop.SystemSleepEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            Map<Character, Character> mapping = new HashMap<>();
            mapping.put(')', '(');
            mapping.put('}', '{');
            mapping.put(']', '[');

            for (char c : s.toCharArray()) {
                if (mapping.containsValue(c)) {
                    stack.push(c);
                } else if (mapping.containsKey(c)) {
                    if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }


    public static void main(String[] args) {
        String s = "(){}[";
        ValidParentheses validParentheses = new ValidParentheses();
         System.out.println(validParentheses.isValid(s));


    }


}
