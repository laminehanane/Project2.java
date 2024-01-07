package Project2;

import java.util.Arrays;

public class StringAreAnagrams {
    //Check if Two Strings are Anagrams: Given two strings, determine if they
    //are anagrams, meaning they contain the same characters in a different order.
    //For example, "listen" and "silent" are anagrams.
    public static void main(String[] args) {
     String str1="listen";
     String str2="silent";
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean areAnagrams = Arrays.equals(charArray1, charArray2);
        System.out.println("Are Anagrams? " + areAnagrams);









    }







}
