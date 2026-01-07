package Placement.Day21;

public class p4 { // palindrome subsequence using LCS
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

    public static int longestPalindromicSubsequence(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return lcs(s, rev, s.length(), rev.length());
    }

    public static void main(String[] args) {
        String s = "BBABCBCAB";
        int length = longestPalindromicSubsequence(s);
        System.out.println("Length of Longest Palindromic Subsequence is: " + length);
    }
    
}
