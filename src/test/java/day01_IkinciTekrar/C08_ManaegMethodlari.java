package day01_IkinciTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_ManaegMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();
        //maximize iken boyutlari ve konumu alalim
        System.out.println("maximize konum : "+driver.manage().window().getPosition());
        System.out.println("maximize boyut : "+driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : "+driver.manage().window().getPosition());
        System.out.println("fullscreen boyut : "+driver.manage().window().getSize());



    }
}
