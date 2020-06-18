package day51_Recap;
/*
  6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ShapesObjects {

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        Cylinder cylinder1 = new Cylinder(3, 5);
        Cylinder cylinder2 = new Cylinder(3, 5);

        ArrayList<Shape> list = new ArrayList<>();
        list.addAll( Arrays.asList(circle1,circle2 , cylinder1, cylinder2 ) );

        for(Shape eachShape : list ){
            System.out.println( eachShape.name +" : " + eachShape.calculateArea() );
        }



/*
       // Shape shape1 = circle1; // upcasting
        Shape shape2 = new Cylinder(3,6);
       // shape2.calculateVolume();
        (  (Cylinder)shape2 ).calculateVolume();  // down casting

 */

    }


}
