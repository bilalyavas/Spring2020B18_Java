package day51_Recap;
/*
 5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Cylinder"
                set a constructor that can initialize the radius and height
 */

public final class Cylinder extends Shape implements Volume, PI {
    public double radius;
    public double height;

    static{
        name = "Cylinder";
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return (PI * 2 * radius * radius) + (height * PI * 2 * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
