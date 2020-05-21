package day43_MethodOverriding;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1.radius);


        circle1.calculateArea();  // bug
        circle1.calculatePerimeter(); // bug


    }

}
