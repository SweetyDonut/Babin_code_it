package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;


/**
 * Created by user on 08.02.2017.
 */
public class TestBase {


    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    /////////////////////////////////////начало тестирования////////////////////////////////////////////////////////////
    @BeforeMethod
    public void setUp() throws Exception {
        app.init();

    }


    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
