package com.gmail.ditritusa.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Phonebook")
public class Phonebook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @NotNull
    @NotBlank
    @Size(max=15)
    @Column(name = "phonenumber", length = 15, nullable = false)
    private String phonenumber;
    @NotNull
    @NotBlank
    @Size(max=25)
    @Column(name = "surname", length = 25, nullable = false)
    private String surname;
    @NotNull
    @NotBlank
    @Size(max=25)
    @Column(name = "firstname", length = 25, nullable = false)
    private String firstname;

    public Phonebook() {
    }

    public Phonebook(String phonenumber, String surname, String firstname) {
        this.phonenumber = phonenumber;
        this.surname = surname;
        this.firstname = firstname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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

    @Override
    public String toString() {
        return "Phonebook{" +
                "id=" + id +
                ", phonenumber='" + phonenumber + '\'' +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
