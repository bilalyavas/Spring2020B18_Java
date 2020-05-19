package day42_Inheritance.Task02;
/*
 creata a class called device:
                attributes: brand, model, price, country, type
                methods: toString
 */
public class Device {

    public String brand;
    public String model;
    public double price;
    public static String country = "China";
    public String type;

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Type: "+type+", Price: $"+price+", Made in: "+country;
    }


}
