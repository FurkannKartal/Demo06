package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.HomePage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        ProductPage productPage =new ProductPage();
        HomePage homePage= new HomePage();
        LoginPage loginPage= new LoginPage();
        homePage.home();
        loginPage.login();
        productPage.product();
                System.out.println("İslem basarili");

    }
}
