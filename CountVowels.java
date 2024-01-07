package Project2;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("In:");
        String word = s.nextLine();

        String V = word.replaceAll("[^aeiouAEIOU]", " ");

        System.out.println(V);
        System.out.println("********second methode***********");
        String docString = "documentation";
        long vowelCount = docString.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
        System.out.println("Vowel count: " + vowelCount);
    }
}
