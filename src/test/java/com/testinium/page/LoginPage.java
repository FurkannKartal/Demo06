package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

import java.util.Scanner;
dsfsad
public class LoginPage {
    Methods methods;
    public LoginPage(){
        methods= new Methods();
    }
    public void login(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adı girin:");
        String userName = myObj.nextLine();
        System.out.println("Lütfen şifre girin:");
        String passWord = myObj.nextLine();

        System.out.println(userName + " " + passWord);
        methods.waitUntilElementClickable(By.id("nav-link-accountList"));
        methods.clickElement(By.id("nav-link-accountList"));
        methods.waitUntilElementAppear(By.cssSelector("div>input[name='email']"));
        methods.sendKeys(By.cssSelector("div>input[name='email']"),"dtestinium@gmail.com");
        methods.waitUntilElementClickable(By.className("a-button-input"));
        methods.clickElement(By.className("a-button-input"));
        methods.waitUntilElementAppear(By.cssSelector("div>input[id='ap_password']"));
        methods.sendKeys(By.cssSelector("div>input[id='ap_password']"),"kartal123");
        methods.waitUntilElementClickable(By.id("signInSubmit"));
        methods.clickElement(By.id("signInSubmit"));
        methods.getTextElement(By.className("a-list-item"));
        methods.waitBySeconds(1);

    }
}
