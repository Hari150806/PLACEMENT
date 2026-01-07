package Placement.Day21;

public class p5 { // minimum number of deletions to make string palindrome
    public static int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcs(s1, s2, m - 1, n - 1);
        } else {
            return Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
        }
    }

    public static int minDeletionsToPalindrome(String str) {
        String revStr = new StringBuilder(str).reverse().toString();
        int lcsLength = lcs(str, revStr, str.length(), revStr.length());
        return str.length() - lcsLength;
    }

    public static void main(String[] args) {
        String str = "agbcba";
        int result = minDeletionsToPalindrome(str);
        System.out.println("Minimum number of deletions to make the string a palindrome: " + result);
    }
    
}
