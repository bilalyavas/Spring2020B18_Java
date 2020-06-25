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
        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        for( Iterator<String> I = students.iterator(); I.hasNext() ;  ){
            String s = I.next();
            if(s.contains("m") || s.contains("M")){
                I.remove();
            }
        }

        System.out.println(students);

        System.out.println("=====================================================");
        LinkedHashSet<String> n = new LinkedHashSet<>();
        n.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        n.removeIf( s -> s.contains("m") || s.contains("M") );

        System.out.println(n);

        System.out.println("==========================================");

        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        T.removeAll( Arrays.asList( "Mehmet", "Ozgur", "Mohammed" ));

        System.out.println(T);

        System.out.println("=================================================");
        LinkedHashSet<String> R = new LinkedHashSet<>();
        R.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        R.retainAll( Arrays.asList( "Yucel", "Sha", "Ahmet" ) );

        System.out.println(R);




    }

}
