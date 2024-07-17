package leetcode;

public class FirstOccurrenceString {
    public int strStr(String haystack, String needle){
        int result = needle.length();
        if(haystack == null || needle == null || haystack.length() < needle.length() || needle.length() == 0){
            return -1;
        }
        int  j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                int idx = i;
                while (j < needle.length() && haystack.charAt(idx) == needle.charAt(j)) {
                    j++;
                    idx++;
                    if (j == needle.length()) {
                        return idx - needle.length();
                    }

                    if(idx >= haystack.length()){
                        return -1;
                    }
                }
                j = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        FirstOccurrenceString firstOccurrenceString = new FirstOccurrenceString();
        System.out.println(firstOccurrenceString.strStr("leetcodeleeto", "leeto"));

    }
}
