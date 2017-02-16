package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;


import java.util.concurrent.TimeUnit;

/**
 * Created by user on 08.02.2017.
 */
public class ApplicationManager {

    private WebDriver wd;

    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
//        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.14.0-win64\\geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//        System.setProperty("webdriver.ie.driver","C:\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");



        if (browser.equals(BrowserType.FIREFOX))  wd = new FirefoxDriver();

        else if (browser.equals(BrowserType.CHROME))  wd = new ChromeDriver();

        else if(browser.equals(BrowserType.IE)) wd= new InternetExplorerDriver();

        navigationHelper = new NavigationHelper(wd);
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);

        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook");

        sessionHelper.login("admin", "secret");
    }


    public void stop() {
        wd.quit();
    }


    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}


