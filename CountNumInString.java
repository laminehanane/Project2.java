package Project2;

import java.util.Scanner;

public class CountNumInString {
    public static void main(String[] args) {
        //Count the Number of Words in a String: Write a function to count the
        //number of words in a given string. Words are separated by spaces or
        //punctuation. For example, the input "Hello, world!" should return 2.

        Scanner s=new Scanner(System.in);
        System.out.println("Input: ");
        String str=s.nextLine();
        System.out.println(str.split(" ").length);
    }
}
