package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import org.junit.Test;
deneme
public class LoginTest extends BaseTest {
    deneeme
    @Test
    public void loginTest(){

        LoginPage loginPage= new LoginPage();
        loginPage.login();
        System.out.println("Login Test Basarili");
    }
}
