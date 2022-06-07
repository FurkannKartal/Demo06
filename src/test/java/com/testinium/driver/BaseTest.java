package com.testinium.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
    public static WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");    // Chrome driver dizinini belirttik
        DesiredCapabilities capabilities = new DesiredCapabilities();                           //Browser ayarları için tanımlama yaptık
        ChromeOptions options= new ChromeOptions();                                             //Chrome ayarları için tanımlama yaptık

        options.addArguments("test-type");                                                      //Browserı test modunda çalıştırır.
        options.addArguments("disable-popup-blocking");                                         //Pop-up ları kapatır
        options.addArguments("ignore-certificate-errors");                                      //Güvenlik sertifikası istenirse atlar
        options.addArguments("disable-translate");                                              //Dil çevirme seçeneğini kapatır
        options.addArguments("start-maximized");                                                //Browserı tam ekran yapar
        options.addArguments("disable-automatic-password-saving");                              //Şifreleri otomatik kaydetme bildirimini kapatır
        options.addArguments("allow-silent-push");                                              //ChromeNotification'ları kapatır
        options.addArguments("disable-infobars");                                               //Bilgi ekranını kapatır
        options.addArguments("--disable-notifications");                                        //Tüm notifications'ları kapatır

        capabilities.setCapability(ChromeOptions.CAPABILITY,options);                           //Chrome ayarlarını selenium ayarlarına dönüştürdük.
        driver= new ChromeDriver(options);
        driver.navigate().to("https://www.google.com.tr");
        driver.navigate().to("https://www.amazon.com.tr");
    }
    @After
    public void after(){
        if (driver!=null){
            driver.close();
            driver.quit();
        }
    }
}

