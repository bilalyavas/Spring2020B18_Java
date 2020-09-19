package day54_Maps;

import java.util.*;
import java.util.LinkedHashMap;

public class mapdeneme {
    public static Map<String, Integer>  sortByValue(Map<String, Integer> map){

        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        System.out.println(list);
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap();

        for(Map.Entry<String, Integer> each : list) {

            map.put(each.getKey(), each.getValue());

        }

        return map;

    }

    public static void main(String[] args) {
      Map<String, Integer> countries = new LinkedHashMap<>();
        countries.put("Tajikistan", 7);
        countries.put("Kyrgyzstan",4);
        countries.put("USA", 5);
        countries.put("Turkey", 6);
        System.out.println(sortByValue(countries ));

    }
}
