package bireyselCalisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A01_Test {
    /*
    Aşağıda, otomasyon pratiği yapmak için kullanabileceğiniz test senaryolarının listesi bulunmaktadır. Ayrıntılı test adımları için senaryoya tıklayın:
Test durumu 1: Kullanıcıyı kaydet
1. Tarayıcıyı başlatın
2. 'http://automationexercise.com' url'sine gidin
3. Ana sayfanın açıkça görülüp görülmediğini kontrol edin
4. 'Kaydol / Giriş Yap' düğmesine tıklayın
5. 'Yeni kullanıcı kaydolun!' seçeneğini işaretleyin. görünür
6. Adı ve e-posta adresini girin
7. 'Kaydol' düğmesine tıklayın
8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin görünüp görünmediğini kontrol edin
9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Şifre, Doğum Tarihi
10. 'Bültenimize kaydolun!' kutusunu işaretleyin.
11. 'Ortaklarımızdan özel teklifler alın!' kutusunu işaretleyin. de!
12. Ayrıntıları doldurun: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
13. 'Hesap oluştur' düğmesine tıklayın
14. 'HESAP OLUŞTURULDU!' seçeneğini doğrulayın. görünür
15. 'Devam' düğmesine tıklayın
16. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olup olmadığını kontrol edin
17. 'Hesabı Sil' düğmesine tıklayın
18. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. görünür ve 'Devam' düğmesine tıklayın
     */
    public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            // 1. Tarayıcıyı başlatın
           // 2. 'http://automationexercise.com' url'sine gidin
        driver.navigate().to("http://automationexercise.com");
           // 3. Ana sayfanın açıkça görülüp görülmediğini kontrol edin
        WebElement anasayfa=driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        anasayfa.isDisplayed();
        if(anasayfa.isDisplayed()){
            System.out.println("anasayfa test passed");
        }else {
            System.out.println("test failed");

        }

        //WebElement anasayfa=driver.findElement(By.)
       // 4. 'Kaydol / Giriş Yap' düğmesine tıklayın
       WebElement signUp=driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        signUp.click();

       // 5. 'Yeni kullanıcı kaydolun!' seçeneğini işaretleyin. görünür
        WebElement newUser=driver.findElement(By.xpath("(//h2)[3]"));
        if (newUser.isDisplayed()) {
            System.out.println("new user goruntuleniyor");
        }else System.out.println("new user goruntulenmiyor");

       // 6. Adı ve e-posta adresini girin
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("meryem");
        WebElement email=driver.findElement(By.xpath("(//input[@name='email'])[2]"));
        email.sendKeys("meryemaydin@gmail.com");

       // 7. 'Kaydol' düğmesine tıklayın
        WebElement kaydol=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        kaydol.click();
       // 8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin görünüp görünmediğini kontrol edin
        WebElement hesapBilgileriElementi=driver.findElement(By.xpath("(//b)[1]"));
        if (hesapBilgileriElementi.isDisplayed()) {
            System.out.println("hesap bilg gorunuyor");
        }else System.out.println("hesap bil gorunmuyor");

       // 9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Şifre, Doğum Tarihi

       // 10. 'Bültenimize kaydolun!' kutusunu işaretleyin.
        //11. 'Ortaklarımızdan özel teklifler alın!' kutusunu işaretleyin. de!
       // 12. Ayrıntıları doldurun: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
       // 13. 'Hesap oluştur' düğmesine tıklayın
       // 14. 'HESAP OLUŞTURULDU!' seçeneğini doğrulayın. görünür
       // 15. 'Devam' düğmesine tıklayın
       // 16. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olup olmadığını kontrol edin
        //17. 'Hesabı Sil' düğmesine tıklayın
      //  18. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. görünür ve 'Devam' düğmesine tıklayın



    }
}