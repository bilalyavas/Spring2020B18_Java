package day53_Iterable_Maps;

import java.util.*;
import java.util.jar.JarOutputStream;

public class Collection_Practice {

    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list=Collections.synchronizedList(list);

        Set<Integer>set = new HashSet<>();
        set= Collections.synchronizedSet(set);
        System.out.println("+===============================================");
        String [] arr = {"E","E","A","B"};
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(linkedHashSet);
        for(String each : linkedHashSet){
            //linkedHashSet.add(linkedHashSet);

        }
        System.out.println(linkedHashSet);
        System.out.println("=============================================");
        ArrayList<String>arrayList = new ArrayList<>(Arrays.asList(arr));

    }

}
