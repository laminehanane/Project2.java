package Project2;

public class AlphaCharIsPresent {
    public static void main(String[] args) {
        //2. Count alpha characters in a string
        String word="new year 2024";
        int count=word.replaceAll("[^a-zA-Z]","").length();
        System.out.println("Alpha characters count: "+count);

    }
}
