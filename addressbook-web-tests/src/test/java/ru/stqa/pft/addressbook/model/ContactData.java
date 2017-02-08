package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String homePhone;
    private final String mail;

    public ContactData(String firstName, String middleName, String lastName, String nickName, String homePhone, String mail) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.homePhone = homePhone;
        this.mail = mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMail() {
        return mail;
    }
}
