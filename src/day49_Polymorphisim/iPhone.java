package day49_Polymorphisim;

public class iPhone extends Phone implements AppleApps {

    static{
        brand = "iPhone";
    }

    public iPhone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void download() {
        System.out.println("iPhone is downloading apps from "+AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling to "+phoneNumber);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming to "+phoneNumber);
    }



}


/*

    5. create a class named iPhone that can inherit from AppleApps and Phone
            actions that every iphone can do: texting(), calling(), faceTiming()
 */