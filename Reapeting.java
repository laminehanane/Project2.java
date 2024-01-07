package Project2;

import java.util.Optional;

public class Reapeting {
    public static void main(String[] args) {


        String nonRepeatingStr = "abracadabra";
        Optional<Character> firstNonRepeating = nonRepeatingStr.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> nonRepeatingStr.indexOf(ch) == nonRepeatingStr.lastIndexOf(ch))
                .findFirst();
        System.out.println("First Non-Repeating Character: " + firstNonRepeating.orElse('5'));


    }

}
