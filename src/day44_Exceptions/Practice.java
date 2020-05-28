package day44_Exceptions;

public class Practice {

    public static void main(String[] args) {
        /*
          print hello,
           wait two seconds
            print Cybertek
            wait three second
            Java
         */

        System.out.println("Hello");

        try {
            Thread.sleep(2000);
        }catch (Exception e){ }

        System.out.println("Cybertek");

        try {
            Thread.sleep(3000);
        }catch (Exception e){ }

        System.out.println("Java");

        try {
            Thread.sleep(4000);
        }catch (Exception e){ }

        System.out.println("Completed");

    }

}
