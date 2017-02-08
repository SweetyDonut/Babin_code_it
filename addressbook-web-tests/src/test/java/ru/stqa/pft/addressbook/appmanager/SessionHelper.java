package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by user on 08.02.2017.
 */
public class SessionHelper extends HelperBase {


    public SessionHelper(FirefoxDriver wd) {
        super(wd);

    }
    public void login(String userName, String password) {
        type(By.name("user"),userName);
        type(By.name("pass"),password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
