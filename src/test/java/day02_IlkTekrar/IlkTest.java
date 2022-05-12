package day02_IlkTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IlkTest {
    public static void main(String[] args) {
         /*
        1-https://www.amazon.com url ine gidin
        2-basligin Amazon kelimesi icerdigini test edin
        3-url'in "https://www.amazon.com" a esit oldugunu test edin
        4-sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-https://www.amazon.com url ine gidin
        driver.get("https://www.amazon.com");
        //2-basligin Amazon kelimesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String aranaKElime = "Amazon";
        if (actualTitle.contains(aranaKElime)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }


        //3-url'in "https://www.amazon.com" a esit oldugunu test edin

        String actualURL = driver.getCurrentUrl();
        String arannUrl = "https://www.amazon.com";
        if (actualURL.equals(arannUrl)) {

            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        //4-sayfayi kapatin
        driver.close();
    }
}
