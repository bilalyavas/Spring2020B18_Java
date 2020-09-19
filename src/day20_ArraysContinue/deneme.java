package day20_ArraysContinue;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.Array;
import java.util.Arrays;

public class deneme {
   public static int minValue(int [] n){
    int min = Integer.MAX_VALUE;
    for(int each:n){
        if (each<min){
            min=each;
        }
    }
    return min;

   }



    public static void main(String[] args) {
        int [ ] minNumber = {1,45,34,2,34,-98,56};
        System.out.println(minValue(minNumber));
    }



}
