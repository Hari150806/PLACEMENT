package Placement.Day27;

public class p1 { // check anagrams using trie 

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int count;

        TrieNode() {
            count = 0;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static class Trie {
        TrieNode root;

        Trie() {
            root = new TrieNode();
        }

       
        void insert(String word) {
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (root.children[index] == null) {
                    root.children[index] = new TrieNode();
                }
                root.children[index].count++;
            }
        }

        
        boolean removeAndCheck(String word) {
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (root.children[index] == null || root.children[index].count == 0) {
                    return false; 
                }
                root.children[index].count--;
            }
            return true;
        }

        
        boolean isEmpty() {
            for (int i = 0; i < 26; i++) {
                if (root.children[i] != null && root.children[i].count != 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Trie trie = new Trie();
        trie.insert(str1);

        if (!trie.removeAndCheck(str2)) {
            return false;
        }

        return trie.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
