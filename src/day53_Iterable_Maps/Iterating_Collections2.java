package day53_Iterable_Maps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Iterating_Collections2 {

    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );
        System.out.println(names);

       Iterator<String> it = names.iterator();
       while( it.hasNext() ){
           String s = it.next();
           if(s.contains("m") || s.contains("M")){
               it.remove();
           }
       }

        System.out.println(names);

        System.out.println("==============================================");

    }

}
