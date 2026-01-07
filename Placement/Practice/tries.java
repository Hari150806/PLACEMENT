package Placement.Practice;
import java.util.*;
class TrieNode{
    TrieNode[] child=new TrieNode[26];
    boolean EOW;
}
public class tries {
    
    public static void insert(TrieNode root,String str){  //insert a word in trie
        TrieNode temp=root;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(temp.child[c-'a']==null){
                temp.child[c-'a']=new TrieNode();
            }
            temp=temp.child[c-'a'];
        }    
        temp.EOW=true;
    }
    public static void printAllWords(TrieNode root,String str){  //print all words in trie
        if(root.EOW==true){
            System.out.println(str);
        }
        for(int i=0;i<26;i++){
            if(root.child[i]!=null){
                printAllWords(root.child[i],str+(char)(i+'a'));
            }
        }

    }
    public static boolean search(TrieNode root,String str){  //search a word in trie
        TrieNode temp=root;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(temp.child[c-'a']==null){
                return false;
            }
            temp=temp.child[c-'a'];
        }    
        if(temp.EOW==true){
            return true;
        }
        return false;
    }
    public static int countWords(TrieNode root){  //count total words in trie
        if(root==null){
            return 0;
        }
        int count =1;
       
        for(int i=0;i<26;i++){
            count+=countWords(root.child[i]);
        }
        return count;
    }  


    public static boolean startwith(TrieNode root,String str){  //prefix matching
        TrieNode temp=root;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(temp.child[c-'a']==null){
                return false;
            }
            temp=temp.child[c-'a'];
        }    
        return true;
    }
    public static void autowrite(TrieNode root,String prefix){  // print all words with given prefix
        TrieNode temp=root;
        for(int i=0;i<prefix.length();i++){
            char c=prefix.charAt(i);
            if(temp.child[c-'a']==null){
                return ;
            }
            temp=temp.child[c-'a'];
        }    
        printAllWords(temp,prefix);
    }
    public static void main(String[] args) {
        TrieNode root=new TrieNode();
        insert(root,"apple");
        insert(root,"application");
        insert(root,"apply");
        insert(root,"apps");
        insert(root,"approve");
        insert(root,"zoo");
        insert(root,"zoopark");
        insert(root,"animal");
        insert(root,"antartica");
        insert(root,"ant");
        insert(root,"antinational");

        //System.out.println(countWords(root));
        //System.out.println(search(root,"app"));
        //System.out.println(startwith(root,"app"));
        //printAllWords(root,"");
        //autowrite(root,"app");
    }
}
