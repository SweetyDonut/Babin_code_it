package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by user on 08.02.2017.
 */
public class ContactModificationTests extends TestBase{

    @Test
    public void contactModificationTests(){
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("42sdfds2", "422fdsfsd33", "442", "fisdfsdndFor", "567sdfsd3554", "denisfisdfsdfn@lipetsk.ru"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();
    }
}
