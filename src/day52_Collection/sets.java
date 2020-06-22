package day52_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class sets {

    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");

        System.out.println(names);

        String[] arr = {"A", "A", "C", "B", "A"}; // ACB

        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(arr)); // [A,C, B]

        System.out.println(set1);



    }

}
