package day01_IkinciTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_Navigated {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //selenium insan davranislarini taklit eden methodlar uretmsitir.
        //iki sayfa arasinda gezmek icin ileri geri kullaniriz :
        //selenium oncelikle driver. get() yerine driver.navigate.to() methodu ile baslayarak
        //sonrasinda  driver.navigate().back()  driver.navigate().forward() ile yapar

        driver.navigate().to("https://bbc.com");
        Thread.sleep(3000);

        driver.navigate().to("https://tnt.com");
        Thread.sleep(3000);
        //bbc ye geri gidelim
        driver.navigate().back();
        Thread.sleep(3000);
        //tekrar tnt ye gidelim
        driver.navigate().forward();

        //sayfayi yenileyelim
        driver.navigate().refresh();

        driver.close();

    }
}
