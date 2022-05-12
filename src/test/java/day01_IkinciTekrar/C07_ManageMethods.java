package day01_IkinciTekrar;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_ManageMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//bu da bir manage methoddur
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//bu da bir manage methoddur

        System.out.println(driver.manage().window().getSize());//pencere olculeri
        System.out.println(driver.manage().window().getPosition());//pencere konumu

        //pencerenin konumunu ve buyuklugunu degistirelim
        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));


        System.out.println("yeni olcu "+driver.manage().window().getSize());//pencere olculeri
        System.out.println("yeni konum " +driver.manage().window().getPosition());//pencere konumu

        driver.close();

    }
}
