package day01_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Navigate {
    public static void main(String[] args) throws InterruptedException {
      /*
        Eger testimiz sirasinda birden fazla sayfa arasinda ileri geri hareket edeceksek
        driver.get() yerine driver.navigate().to() method'unu kullaniriz
        ve sonrasinda forward(), back() veya refresh() method'larini kullanabiliriz
                */
        System.setProperty("webdriver.chrome.driver","src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://facebook.com");
        System.out.println(driver.getWindowHandle());
        Thread.sleep(2000);

        driver.navigate().to("https://amazon.com");
        System.out.println(driver.getWindowHandle());//sayfalarin kimliklerini getiriyor
        //islem ayni pencerede gerceklestigi icin
        //CDwindow-1F3D492F5C1262799C5396330C4C4C07
        //CDwindow-1F3D492F5C1262799C5396330C4C4C07
        // bunu verdi
        Thread.sleep(2000);

        //facebook'a geri donelim
        driver.navigate().back();


        //amazon a geri don
        driver.navigate().forward();

        //sayfayi yenile
        driver.navigate().refresh();


        driver.close();

    }
}
