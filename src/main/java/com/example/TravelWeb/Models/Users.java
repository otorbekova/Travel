package com.example.TravelWeb.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int idUser;
    @Column(name = "nameuser")
    @Size(max = 50, message = "Max symbol 50 and no more")
    private String nameuser;
    @Column(name = "mail")
    @Email(message = "Invalid email address")
    private String mail;
    @Column(name = "phonenumber")
    private String number;
    @Column(name = "password")
    @Size(min = 2, message = "min=2  symbol and more")
    private String password;

    public Users (){

    }
    public Users(String nameuser, String mail, String number, String password) {
        this.nameuser = nameuser;
        this.mail = mail;
        this.number = number;
        this.password = password;

    }

    @Column(name = "role")
    private String role;

    @Override
    public String toString() {
        return "Users{" +
                "idUser=" + idUser +
                ", nameuser='" + nameuser + '\'' +
                ", mail='" + mail + '\'' +
                ", number='" + number + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
