package day50_Polymorphism;

public class AnimalObjects {

    public static void main(String[] args) {
        Dog obj1= new Dog("Lucy", 5, "Female");
        System.out.println(obj1.dogName);
        obj1.bark();


        Animal obj2= new Dog("Kito", 6, "Female");
        //System.out.println( obj2.dogName);
        //obj2.bark();

        obj2.eat();


    }

}
