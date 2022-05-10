package day01_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ders1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resourcus/drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();//ekrani buyutmek icin


    driver.get("https://amazon.com");
    Thread.sleep(2000);

    driver.get("https:facebook.com");

    driver.close();
    }
}
