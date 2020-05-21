package day43_MethodOverriding;

public class Circle extends Shape{

    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    /*
    area , perimeter
    calculateArea & calculatePrimeter
     */


    public void calculateArea(){
        area = radius * radius * PI;
        System.out.println("Area of the Circle: "+area);
    }

    public void calculatePerimeter(){
        perimeter = radius * 2 * PI;
        System.out.println("Perimeter of the circle: "+perimeter);
    }




}
