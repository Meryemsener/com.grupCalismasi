package day01_IkinciTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_IlkTest {
    public static void main(String[] args) {
       /*
       1-https://amazon.com sayfasina gidin
       2-basligin Amazon kelimesi icerip icermedigini test edin
       3-url 'in  https://amazon.com a esit oldugunu test edin
       4- sayfayi kapatin
        */

        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//browseri tam sayfa yapar
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1-https://amazon.com sayfasina gidin
        driver.get("https://amazon.com/");
        // 2-basligin Amazon kelimesi icerip icermedigini test edin
        String actuelTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if (actuelTitle.contains(arananKelime)) {
            System.out.println("test PASSED");
        } else System.out.println("Test FAILED");


        // 3-url 'in  https://amazon.com a esit oldugunu test edin
        String actuelUrl = driver.getCurrentUrl();
        String arananUrl = "https://amazon.com";
        if (actuelUrl.equals(arananUrl)) {
            System.out.println("Test PAssed");
        } else System.out.println("Test FAILED");

        // 4- sayfayi kapatin
        driver.close();

    }
}
