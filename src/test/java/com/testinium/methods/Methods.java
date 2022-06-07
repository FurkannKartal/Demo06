package com.testinium.methods;

import com.testinium.driver.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;
    Logger log= LogManager.getLogger(Methods.class);

    public Methods(){

        driver= BaseTest.driver;
        wait= new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by){
        return driver.findElement(by);
    }
    public void clickElement(By by){
        findElement(by).click();
    }
    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);
    }
    public void getTextElement(By by){
        findElement(by).getText();
    }
    public void hoverElement(By by){
        Actions actions= new Actions(driver);
        log.info(by+"Elementine scroll edildi");
        log.info("commit eklendi");
        log.info("commit eklendi mi")
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void assertionTrue(String massage, boolean condition){
        Assert.assertTrue("massage",condition);
    }
    public void waitUntilPresence(By by){           //Element Hazır olana kadar bekle
        log.info("Elementin hazır olması bekleniyor");
        log.info("Yeni commit eklenmiştir");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
    public boolean waitUntilElementAppear(By by){      //element görünene kadar bekleme methodu
        try {
            log.info("Elementin görünür olması bekleniyor");
            log.info("deneme");
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch (Exception e){
            return false;
        }

    }
    public void waitUntilElementClickable(By by){       //Element tıklanabilir olana kadar bekleme
        log.info("Butonun tıklanabilir olması bekleniyor");
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public void waitBySeconds(long seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void cpmboBox(By by,String massage){
        log.info("Butona tıklama işlemi yapılır");
        WebElement selectElement= driver.findElement(by);
        Select select= new Select(selectElement);
        select.selectByVisibleText(massage);
    }


}
