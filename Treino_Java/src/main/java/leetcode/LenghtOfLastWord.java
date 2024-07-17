package leetcode;

public class LenghtOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        String[] lastWord = words[words.length - 1].split("");
        return lastWord.length;
    }

    public static void main(String[] args) {
        LenghtOfLastWord l = new LenghtOfLastWord();
        String s = "Let's take LeetCode contest";
        System.out.println(l.lengthOfLastWord(s));

    }
}
