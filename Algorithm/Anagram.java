/*
a. Desc -> One string is an anagram of another if the second is simply a
rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
c. O/P -> The Two Strings are Anagram or not....
 */
package org.example.Algorithm;
import java.util.Arrays;
import java.util.Hashtable;

public class Anagram {
    /*
    @desc: check if two strings are anagram or not  by sorting both arrays of char
            and comparing it
    @params: two Strings
    @return: boolean value if anagram then true else false
     */
    boolean checker(String str1, String str2) {
        char[] temp1 = str1.toCharArray();
        char[] temp2 = str2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if(temp1.length!=temp2.length) return false;
        for(int i=0;i<temp1.length;i++){
            if(temp1[i]!=temp2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Anagram ag= new Anagram();
        System.out.println(ag.checker("abcd","dcba")); // true
        System.out.println(ag.checker("aaab","baaa")); // true
        System.out.println(ag.checker("aabb","baba")); // true
        System.out.println(ag.checker("aabba","bababa")); // false
        System.out.println(ag.checker("hence","encfh"));  // false

    }
}