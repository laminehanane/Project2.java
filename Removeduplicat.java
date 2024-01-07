package Project2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicat {
    public static void main(String[] args) {


        List<String> stringArrayList = new ArrayList<>(List.of("A", "B", "A", "C", "B"));
        Set<String> uniqueSet = new LinkedHashSet<>(stringArrayList);
        stringArrayList.clear();
        stringArrayList.addAll(uniqueSet);
        System.out.println("ArrayList without duplicates: " + stringArrayList);

    }
}