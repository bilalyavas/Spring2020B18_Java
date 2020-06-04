package day47_Abstraction;

public class driverObjects {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

        System.out.println("================================");
        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.google.com");
        driver2.quit();

        System.out.println("==================================");




    }

}
