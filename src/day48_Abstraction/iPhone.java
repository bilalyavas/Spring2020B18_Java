package day48_Abstraction;

public class iPhone extends Phone {

    public iPhone(String model, double price, String size){
        brand = "iPhone";
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling with "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting with "+phoneNumber);
    }

    public void FaceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming with "+phoneNumber);
    }

}
