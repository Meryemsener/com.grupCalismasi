package day01_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //1-https://amazon.com url sine gidin
        driver.get("https://amazon.com");

        //2-basligin Amazon kelimesi icerdigini test edin
        String mevcutBaslik = driver.getTitle();
        String arananKelime = "Amazon";
        if (mevcutBaslik.contains(arananKelime)) {
            System.out.println("test Passed");
        } else System.out.println("Test failed");

        //3-url'nin https://amazon.com 'e esit oldugunu test edin
        String mevcutUrl = driver.getCurrentUrl();
        String arananUrl = "https://amazon.com";
        if (mevcutUrl.equals(arananUrl)) {
            System.out.println("Url ler esit");
        } else System.out.println("asil url olan "+mevcutUrl + "ile aradigimiz url esit degil");
        //4-sayfayi otomatik kapatin
        driver.close();
    }
}
