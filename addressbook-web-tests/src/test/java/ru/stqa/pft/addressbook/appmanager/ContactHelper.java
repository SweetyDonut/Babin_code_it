package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by user on 08.02.2017.
 */
public class ContactHelper extends HelperBase{



    public ContactHelper(WebDriver wd) {
        super(wd);

    }

    public void initContactCreation() {
        click(By.linkText("add new"));

    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {


        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickName());
        type(By.name("home"), contactData.getHomePhone());
        type(By.name("email"), contactData.getMail());

    }

    public void initContactModification() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void deleteContact() {
        findElem(By.xpath("//div[@id='content']/form[2]/input[2]"));
        click(By.xpath("//div[@id='content']/form[2]/input[2]"));}
}
