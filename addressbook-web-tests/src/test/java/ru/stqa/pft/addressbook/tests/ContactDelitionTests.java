package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by user on 08.02.2017.
 */
public class ContactDelitionTests extends TestBase {

    @Test
    public void ContactDelitionTests(){

        app.getNavigationHelper().gotoHomePage();



        app.getContactHelper().initContactModification();

        app.getContactHelper().deleteContact();
        app.getNavigationHelper().gotoHomePage();


    }
}
