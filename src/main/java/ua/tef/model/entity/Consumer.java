package ua.tef.model.entity;

import java.util.Arrays;
import java.util.Date;

public class Consumer {
    private String name;
    private String surname;
    private String patronymic;
    private String nickname;
    private String comment;
    private ContactGroup[] groups;
    private String homePhone;
    private String firstMobilePhoneNumber;
    private String secondMobilePhoneNumber;
    private Address address;
    private String fullAddress;
    private Date recordDate;
    private Date updateDate;

    public Consumer(String name, String surname, String patronymic, String nickname,
                    String comment, String homePhone, String firstMobilePhoneNumber, String secondMobilePhoneNumber, Address address) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.nickname = nickname;
        this.comment = comment;
        this.homePhone = homePhone;
        this.firstMobilePhoneNumber = firstMobilePhoneNumber;
        this.secondMobilePhoneNumber = secondMobilePhoneNumber;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ContactGroup[] getGroups() {
        return groups;
    }

    public void setGroups(ContactGroup[] groups) {
        this.groups = groups;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getFirstMobilePhoneNumber() {
        return firstMobilePhoneNumber;
    }

    public void setFirstMobilePhoneNumber(String firstMobilePhoneNumber) {
        this.firstMobilePhoneNumber = firstMobilePhoneNumber;
    }

    public String getSecondMobilePhoneNumber() {
        return secondMobilePhoneNumber;
    }

    public void setSecondMobilePhoneNumber(String secondMobilePhoneNumber) {
        this.secondMobilePhoneNumber = secondMobilePhoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public void constructFullAddress(){

    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", homePhone='" + homePhone + '\'' +
                ", firstMobilePhoneNumber='" + firstMobilePhoneNumber + '\'' +
                ", secondMobilePhoneNumber='" + secondMobilePhoneNumber + '\'' +
                ", address=" + address.toString() +
                ", fullAddress='" + fullAddress + '\'' +
                ", recordDate=" + recordDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
