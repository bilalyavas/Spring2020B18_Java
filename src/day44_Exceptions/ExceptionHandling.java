package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try{

            System.out.println(str.charAt(400));

        }catch(RuntimeException e){
            String discription  =    e.getMessage();
            System.out.println(discription);
        }

        System.out.println("==========================================");

        System.out.println( 100 / 0 );


        System.out.println("Completed");


    }


}
