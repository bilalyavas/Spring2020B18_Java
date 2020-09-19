package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.jar.JarOutputStream;

public class Maps_Practice1 {
    public static void main(String[] args) {
        LinkedHashMap<String, LocalDate> classMates = new LinkedHashMap<>();
        classMates.put("Taha", LocalDate.of(1998,07,16));
       classMates.put("Anil",LocalDate.of(1453, 01,01));
       classMates.put("Saban", LocalDate.of(1900, 01, 31));
       classMates.put("Anna",LocalDate.of(1990, 2, 28));
       classMates.put("Namik", LocalDate.of(1453, 01, 01));
       classMates.put("Yucel", LocalDate.of(2005, 12, 28));

       classMates.put("Namik", LocalDate.of(1990, 4, 5));
       classMates.put("Anil", LocalDate.now());
       classMates.remove("Anil");

        System.out.println(classMates);

        System.out.println(classMates.get("Namik"));

        Boolean r1 = classMates.containsKey("Muhtar");
        System.out.println(r1);

        Boolean r2 = classMates.containsKey("Anna");
        System.out.println(r2);

        Boolean r3 = classMates.containsValue(LocalDate.of(1990, 4, 5));
        System.out.println(r3);
        classMates.clear();
        System.out.println(classMates);

     }
}
