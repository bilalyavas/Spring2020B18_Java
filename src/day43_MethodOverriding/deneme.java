package day43_MethodOverriding;

public class deneme {
    static class Parent {
        // private methods are not overridden
        private void m1() {
            System.out.println("From parent m1()");
        }

        protected void m2() {
            System.out.println("From parent m2()");
        }
    }

    static class Child extends Parent {
        // new m1() method
        // unique to Child class
        private void m1() {
            System.out.println("From child m1()");
        }

        // overriding method
        // with more accessibility
        @Override
        public void m2() {
            System.out.println("From child m2()");
        }


        // Driver class

        public static void main(String[] args) {
            Parent obj1 = new Parent();
            obj1.m1();
            Parent obj2 = new Child();
            obj2.m1();
            Child obj3 = new Child();
            obj3.m1();

        }
    }
}