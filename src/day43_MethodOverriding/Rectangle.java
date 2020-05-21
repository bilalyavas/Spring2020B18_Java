package day43_MethodOverriding;

public class Rectangle extends Shape {
    /*
    inherited:
            area, perimeter
            calculateArea(), calculatePerimeter()
     */

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }



}
