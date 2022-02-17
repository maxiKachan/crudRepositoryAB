package com.kachan.entity;


import javax.persistence.*;

@Entity
@Table(name = "a_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;
    @Column(name = "surname")
    private String surname;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "phone_number")
    private String phoneNumber;

    public User() {
    }

    public User(String surname, String firstname, String patronymic, String phoneNumber) {
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
    }

    public User(long id, String surname, String firstname, String patronymic, String phoneNumber) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
