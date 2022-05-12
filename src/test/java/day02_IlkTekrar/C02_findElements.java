package day02_IlkTekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) {
        //amazon sayfasinda kac tane link bulundugunu yazdiralim
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        List<WebElement> linkLsietsi=driver.findElements(By.tagName("a"));
        System.out.println("link sayisi : "+ linkLsietsi.size());
        driver.close();
    }
}
