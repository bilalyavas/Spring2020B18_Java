package day53_Iterable_Maps;

import java.util.*;
import java.util.jar.JarOutputStream;

public class Iterating_Collections2 {

    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ahmet","Ozgur","Sha"));
        System.out.println(names);
        Iterator<String> It = names.iterator();
        while (It.hasNext()){
            String s = It.next();
            if(s.toLowerCase().contains("m")){
                It.remove();
            }

        }
        System.out.println(names);
        System.out.println("=================================");
        for(Iterator<String> it = names.iterator(); it.hasNext(); ){
           if(it.next().toLowerCase().contains("m")){
                it.remove();
            }
        }
        System.out.println(names);
        System.out.println("================================");
        LinkedHashSet<String> n = new LinkedHashSet<>();
        n.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ahmet","Ozgur","Sha"));

        n.removeIf(s -> s.contains("m")||s.contains("M"));
        System.out.println(n);

        System.out.println("===================================");
        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ahmet","Ozgur","Sha"));
        T.removeAll(Arrays.asList("Mehmet","Ozgur","Sha"));
        System.out.println(T);
        System.out.println("+++++++++++++++++++++++++++++");

        LinkedHashSet<String> R = new LinkedHashSet<>();
        R.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ahmet","Ozgur","Sha"));
        R.retainAll(Arrays.asList("Yucel","Sha","Ahmet"));
        System.out.println(R);

        System.out.println("=+++++++++++++++++++++++++++++++++++++");
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,5,6,7));
       Boolean result =  list.containsAll(Arrays.asList(5,6,7));
        System.out.println(result);
    }
}
