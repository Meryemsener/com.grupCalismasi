package day02_IlkTekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;


public class C03_Locators {
    public static void main(String[] args) {
        //a. http://a.testaddressbook.com adresine gidiniz.
        // b. Sign in butonuna basin
        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        // b. Sign in butonuna basin
        WebElement signInLinki=driver.findElement(By.linkText("Sign in"));
        signInLinki.click();
        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTexBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.name("session[password]"));
        WebElement signInButonu=driver.findElement(By.name("commit"));
        //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        emailTexBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();
        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualKullaniciAdi=driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdi.getText());//direkt sout ile yazdirmaz element oldugu icin, .getText() size yazdirir
       String expectedUserMail="testtechproed@gmail.com";
       if(expectedUserMail.equals(actualKullaniciAdi.getText())){
           System.out.println("test PASSED");
       }else System.out.println("test FAILED");

        //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adresses=driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi=driver.findElement(By.linkText("Sign out"));

        //gorunur olup olmadigini test etmek icin-true ya da false doner
        if(adresses.isDisplayed()){
            System.out.println("adresses passed");
        }else
        {
            System.out.println("adresses testi failed");
        }
        if(signOutElementi.isDisplayed()){
            System.out.println("signout testi passed");
        }else {
            System.out.println("signout testi failed");
        }

        //sayfada kac tane link oldugunu bulunuz
        List<WebElement> linklerListesi= driver.findElements(By.tagName("a"));
        System.out.println(linklerListesi.size());


        //linkleri yazdiralim
        System.out.println(linklerListesi);//liste icindeki webelement yani obje oldugu icin boyle yazdirilamaz
//bunun yerine foreach kullanilir
        for(WebElement each: linklerListesi){
            System.out.println(each.getText());
        }
        driver.close();
    }
}
