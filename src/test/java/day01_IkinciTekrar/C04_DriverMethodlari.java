package day01_IkinciTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        /*
        amazon sitesine gidip kaynak kodlarinda "spend less" yazdigini test edin
         */
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        driver.get("https://amazon.com");

        String sayfaKaynakKodlari = driver.getPageSource();//kaynak kodlarina gider
        String arananKelime = "spend less";
        if (sayfaKaynakKodlari.contains(arananKelime)) {
            System.out.println("Test passed");
        } else System.out.println("test failed");
        */




        driver.get("https://loreal.com");
        String sayfaKaynakKodlari1 = driver.getPageSource();//kaynak kodlarina gider
        String arananKelime1 = "beauty";
        if (sayfaKaynakKodlari1.contains(arananKelime1)) {
            System.out.println("Test passed");
        } else System.out.println("test failed");
        driver.close();
    }
}
