package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;
import org.junit.Assert;
import safasd;


public class ProductPage {
    Methods methods;
    public ProductPage(){
        methods= new Methods();

    }
    public void product(){
        asdsdas
        methods.waitUntilPresence(By.cssSelector("div>a[id='nav-hamburger-menu']"));
        methods.waitUntilElementAppear(By.cssSelector("div>a[id='nav-hamburger-menu']"));
        methods.waitUntilElementClickable(By.cssSelector("div>a[id='nav-hamburger-menu']"));
        methods.clickElement(By.cssSelector("div>a[id='nav-hamburger-menu']"));
        methods.waitUntilPresence(By.cssSelector("div>ul>li>a[class='hmenu-item hmenu-compressed-btn']"));
        methods.waitUntilElementAppear(By.cssSelector("div>ul>li>a[class='hmenu-item hmenu-compressed-btn']"));
        methods.waitUntilElementClickable(By.cssSelector("div>ul>li>a[class='hmenu-item hmenu-compressed-btn']"));
        methods.clickElement(By.cssSelector("div>ul>li>a[class='hmenu-item hmenu-compressed-btn']"));
        methods.waitUntilPresence(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul/li[7]/a"));
        methods.waitUntilElementAppear(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul/li[7]/a"));
        methods.waitUntilElementClickable(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul/li[7]/a"));
        methods.clickElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul/li[7]/a"));//Kitap menune tıklanır
        methods.waitUntilPresence(By.xpath("//*[@id=\"hmenu-content\"]/ul[11]/li[3]/a"));
        methods.waitUntilElementAppear(By.xpath("//*[@id='hmenu-content']/ul[11]/li[3]"));
        methods.waitUntilElementClickable(By.xpath("//*[@id='hmenu-content']/ul[11]/li[3]"));
        methods.clickElement(By.xpath("//*[@id='hmenu-content']/ul[11]/li[3]"));//Edebiyat ve kurgu menusune tıklanır
        methods.waitUntilPresence(By.xpath("//*[@id='s-refinements']/div[5]")); //scroll hazır olana kadar bekle
        methods.hoverElement(By.xpath("//*[@id='s-refinements']/div[5]"));      //belirtilen elemente kadar scroll et
        methods.waitUntilPresence(By.xpath("//*[@id='s-refinements']/div[5]/ul/li[1]/span"));   //Element hazır olana kadr bekle
        methods.waitUntilElementAppear(By.xpath("//*[@id='s-refinements']/div[5]/ul/li[1]/span"));  //Element görünür olana kadar bekle
        methods.waitUntilElementClickable(By.xpath("//*[@id='s-refinements']/div[5]/ul/li[1]/span"));   //Element tıklanabilir olana kadar bekle
        //methods.clickElement(By.xpath("//*[@id='s-refinements']/div[10]/ul/li[1]"));

        methods.clickElement(By.xpath("//*[@id='s-refinements']/div[5]/ul/li[1]/span"));        //Türkçeye tıklanır

        methods.waitUntilPresence(By.xpath("//span[contains(text(),'Kızıl Veba')]"));   //scroll hazır olana kadar bekler
        methods.hoverElement(By.xpath("//span[contains(text(),'Yalnız Sıkıcı İnsanlar Kahvaltıda Parıldar')]"));    //Kizil Veba ya kadar scroll et
        methods.clickElement(By.xpath("//*[@id='priceRefinements']/ul[1]/li[1]/span"));         //Enfazla 20tl seçilir
        methods.waitUntilPresence(By.xpath("//span[contains(text(),'Kızıl Veba')]"));       //Kızıl veba butonu hazır olana kadar bekle
        methods.waitUntilElementClickable(By.xpath("//span[contains(text(),'Kızıl Veba')]"));   //Kızıl veba butonu tıklanabilir olana kadar bekle
        methods.clickElement(By.xpath("//span[contains(text(),'Kızıl Veba')]"));        //Kızıl veba kitabına tıkla
        methods.waitUntilPresence(By.cssSelector(".a-dropdown-container>select[id='quantity']"));   //Combobox hazır olana kadar bekle
        methods.cpmboBox(By.cssSelector(".a-dropdown-container>select[id='quantity']"),"2");    // Miktarı 2 yap
        methods.waitUntilPresence(By.id("add-to-cart-button"));     //Sepete ekle butonu hazır olana kadar bekle
        methods.waitUntilElementClickable(By.id("add-to-cart-button"));     //Sepete ekle butonu tıklanabilir olana kadar bekle
        methods.clickElement(By.id("add-to-cart-button"));      //Spete ekle butonuna tıklanır
        methods.waitUntilPresence(By.cssSelector("span>span>a[class='a-button-text']"));    //Sepete git butonu hazır olana kadar beklenir
        methods.waitUntilElementClickable(By.cssSelector("span>span>a[class='a-button-text']"));    //Spete git butonu tıklanabilir olana kadar beklenir
        methods.clickElement(By.cssSelector("span>span>a[class='a-button-text']"));         //Spete git butonuna tıklanır
        methods.waitUntilPresence(By.cssSelector("div>span[class='a-size-small sc-action-delete']"));       //Sil butonu hazır olana kadar beklenir
        methods.clickElement(By.cssSelector("div>span[class='a-size-small sc-action-delete']>span>input"));        //Sil butonuna tıklanır
        methods.waitBySeconds(2);
        methods.waitUntilPresence(By.id("nav-logo-sprites"));
        methods.waitUntilElementClickable(By.id("nav-logo-sprites"));
        methods.clickElement(By.id("nav-logo-sprites"));
        methods.waitUntilElementAppear(By.id("nav-logo-sprites"));


    }

}
