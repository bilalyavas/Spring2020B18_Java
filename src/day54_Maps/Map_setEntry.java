package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_setEntry {
    public static void main(String[] args) {
        LinkedHashMap<String, String>countries = new LinkedHashMap<>();
        countries.put("Tajikistan", "Dushanbe");
        countries.put("Kyrgyzstan","Bishkek");
        countries.put("USA", "Washington DC");
        countries.put("Turkey", "Ankara");

        String input = "tajikistan";
        for(Map.Entry<String,String> each : countries.entrySet()) {
            //System.out.println(each.getKey() +"'s capital city is "+each.getValue());

            String countryName = each.getKey();
            String cityname = each.getValue();
            if (input.equalsIgnoreCase(countryName)){

            }

        }

    }
}
