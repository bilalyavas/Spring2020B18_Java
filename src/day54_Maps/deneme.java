package day54_Maps;

public class deneme {
    public static void main(String[] args) {
        int num = 4;

        System.out.println(num );
        method(num);
        System.out.println("------------------------------------");


        String name = new String("Bilal");
        System.out.println(name);

        name= new String("Ilker");
        System.out.println(name);

        String name1 = new String("Bilal");
        String name2 = new String("Bilal");
        System.out.println(name1.equals(name2));
        System.out.println("+++++++++++++++++++++++++++++++++");
        String name3 = "Bilal";
        String name4 = "Bilal";
        System.out.println(name3==name4);


    }
    public static int method(int num){
       num=7;
       System.out.println(num);
        return num;



    }




}
