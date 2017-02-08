package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {


    @Test
    public void contactCreationTests() {

        gotoHomePage();
        initContactCreation();
        fillContactForm(new ContactData("Finogin", "Denis", "Aleksandrovich", "findFor", "5673554", "denisfin@lipetsk.ru"));
        submitContactCreation();
        gotoHomePage();
    }

}
