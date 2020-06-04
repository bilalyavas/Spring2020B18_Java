package day47_Abstraction;

public class driverObjects {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

    }

}
