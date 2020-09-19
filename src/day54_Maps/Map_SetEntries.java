package day54_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {
    public static void main(String[] args) {
        LinkedHashMap<String, String> fb = new LinkedHashMap<>();
        fb.put("Tester1", "password1");
        fb.put("Tester2", "password1");
        fb.put("Tester2", "password2");
        fb.put("Tester3", "password3");
        fb.put("Tester4", "password4");
        System.out.println(fb);

        fb.keySet();
        for(String eachKey:fb.keySet()){
            System.out.println(eachKey+" "+fb.get(eachKey));

        }
        List<String >usernames=new ArrayList<>(fb.keySet());
        System.out.println(usernames);
        System.out.println("=================================");
        fb.values();
        for (String eachValues:fb.values()){
            System.out.println(eachValues);
        }
        List<String>password= new ArrayList<>(fb.values());
        System.out.println(password);

        System.out.println("===================================");
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Anil", 92);
        students.put("Kemal",89);
        students.put("Rahman",75);
        students.put("Hardi",80);
        LinkedHashMap<String, Integer> badstudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodstudents = new LinkedHashMap<>();
        for(String eachKey :students.keySet()){
            int eachValue = students.get(eachKey);
            if(eachValue<90){
               // System.out.println(eachKey);
                badstudents.put(eachKey,eachValue);

            }else{
                goodstudents.put(eachKey,eachValue);
            }

        }
        System.out.println(badstudents);
        System.out.println(goodstudents);



    }
}
