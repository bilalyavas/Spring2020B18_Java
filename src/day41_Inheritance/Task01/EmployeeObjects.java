package day41_Inheritance.Task01;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer dev1 = new Developer(120000,"Namik",123,"Software Developer", 'M');

      //  dev1.reporting();
        dev1.fixingBug();

        System.out.println( dev1 );

        Tester tester1 = new Tester("Hilal", 120005, 456, "QA", 'F' );

       // tester1.coding();
        tester1.reporting();

        System.out.println( tester1 );



    }

}
