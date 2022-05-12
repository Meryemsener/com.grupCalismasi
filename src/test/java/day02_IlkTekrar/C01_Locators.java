package day02_IlkTekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       //Amazon'a gidip nutella aratalim
        //id yi bulmak icin arama cubuguna sag tus yapip ordan inspect'i tikliyoruz
        //mavi isaretli kod satirinda id yi bulup cift tikliyoruz
        //ctrl c ile kopyaliyoruz, ctrl f yi tikladigimizda altta id 'nin yapistirildigi bir satir goruruz
        //satirin karsisinda da x match yazisi cikar. Eger 1 tane ise cok iyi, ve adres uniq tir. sorun yoktur
        //birden fazla ise uniqe olani bulmamiz gerekecektir
        driver.get("https://amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));//istedigimiz web elementini bize dondurur, onu kullanmak icin de biriz bir obje'ye assign ederiz

        //arama kutusunun id sini bulduktan sonra buraya arayacagimiz kelimeyi gonderiyoruz
        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);//amazon a nutella yi yazdirmasi lazim
        //arama kutusundaki bilgiyi aramasi icin de Keys.ENTER i yaziyoruz ki bizim yerimize otomatik enter'lasin

        driver.close();
    }
}
