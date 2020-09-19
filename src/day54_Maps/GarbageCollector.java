package day54_Maps;

public class GarbageCollector {
    public static void main(String[] args) {
       GarbageCollector obj = new GarbageCollector();
       new GarbageCollector();

        System.out.println( "DONE" );

        String str = new String("Cybertek");
        str= new String("MIT");
        System.out.println(str);
        Integer num = new Integer(123);
        num = new Integer(124);

        Double n = new Double(0.5);
        n = null;

        System.out.println(n);

      GarbageCollector obj3 = new GarbageCollector();
      //obj3.finalize(); is a blok,  final is a method




    }

}
