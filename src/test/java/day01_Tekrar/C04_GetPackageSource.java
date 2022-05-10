package day01_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_GetPackageSource {
    public static void main(String[] args) {
        //amazon sayfasina gidip kaynak kodlarinda "Gateway" yazdigini test edin
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");

        String kaynakKodu = driver.getPageSource();
        String arananKelime = "GateWay";

        if (kaynakKodu.contains("Gateway")) {
            System.out.println("test PASSED");

        } else System.out.println("test FAILED");

        driver.close();


    }
}
