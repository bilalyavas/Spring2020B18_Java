package day52_Collection;

import java.util.*;
import java.util.jar.JarOutputStream;

public class Lists {
    public static void main(String[] args) {
       // List<String> list0 =  new List<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(1);
        list1.add(7);
        list1.add(2);
        list1.add(0);
        list1.add(-1);
        System.out.println(list1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(-8);
        list2.add(10);
        list2.add(0);
        list2.add(8);
        list2.remove(0);
        System.out.println(list2);

        System.out.println("===================================");
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);

        LinkedList<Integer> list4 = new LinkedList<>();


        Vector<Integer>  vector = new Vector<>();
        vector.add(0);
        vector.add(10);
        vector.add(7);
        System.out.println(vector);

        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("===========================================");

        Stack<String> names = new Stack<>();
            names.add("Sha");
            names.add("Dovran");
            names.add("Rahman");
            names.add("Anna");
            names.add("Rustem");
            names.add("bilal");
            names.add("last");

        System.out.println(names);

           String s1 = names.pop(); //"Rustem"--> "last"
        System.out.println(s1);
        System.out.println(names);

        String s2 = names.pop();
        System.out.println(s2);
        System.out.println(names);

        names.push("Bilal");
        System.out.println(names);
       String s3 = names.pop();
        System.out.println(names);


    }




}
