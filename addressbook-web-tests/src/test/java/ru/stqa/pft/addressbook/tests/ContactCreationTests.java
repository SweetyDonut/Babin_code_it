package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void contactCreationTests() {

        app.gotoHomePage();
        app.initContactCreation();
        app.fillContactForm(new ContactData("Finogin", "Denis", "Aleksandrovich", "findFor", "5673554", "denisfin@lipetsk.ru"));
        app.submitContactCreation();
        app.gotoHomePage();
    }

}
