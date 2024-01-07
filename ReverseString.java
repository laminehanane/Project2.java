package Project2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse a String: Write a function to reverse a given string. For example,
        //given the input "Hello", the output should be "olleH".
        String inputStr = "Hello";
        String reversedStr = new StringBuilder(inputStr).reverse().toString();
        System.out.println("Reversed String: " + reversedStr);
        System.out.println("********second methopd**********");
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        String reverse="";
        for (int i =s.length()-1; i >=0 ; i--) {
            reverse=reverse+s.charAt(i);

        }
        System.out.println(reverse);
    }
}
