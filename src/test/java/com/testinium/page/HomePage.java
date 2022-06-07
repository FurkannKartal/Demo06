package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
ıjjhkkj
safdsad
asdfsad
public class HomePage {
    Logger log= LogManager.getLogger(Methods.class);
    Methods methods;
    public HomePage(){
        methods= new Methods();
    }
    public void home(){
        log.info("Elementin hazır olması bekleniyor");
        methods.waitUntilPresence(By.id("nav-global-location-popover-link"));
    Assert.assertTrue(methods.waitUntilElementAppear(By.id("nav-global-location-popover-link")));
szcs<d<s
    }
}
az<d<c<z