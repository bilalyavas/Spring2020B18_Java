package day44_Exceptions;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class try_catchBlocks {

    public static void main(String[] args) {
        System.out.println("Test started");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        try{
            System.out.println(list.get(10) );  // index out of bound

        } catch(Exception e){
            System.out.println("Something went wrong");
        }



        System.out.println("Test completed");



    }

}
