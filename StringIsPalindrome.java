package Project2;

public class StringIsPalindrome {
    public static void main(String[] args) {
        String word="Dad";
        String reversedword="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversedword=reversedword+word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversedword)){
            System.out.println("the word is Palindrome");
        }else {
            System.out.println("the word is not Palindrome");
        }
    }

}
