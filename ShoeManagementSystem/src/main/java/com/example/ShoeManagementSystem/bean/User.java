package com.example.ShoeManagementSystem.bean;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//making user class for handling user details
@Entity        //making it Entity using @Entity annotation
@Table(name = "user")
public class User {
    //attributes of user are as follows
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //using this Id's will be automatically generated
            int id;
    String userName;
    String address;
    String mobileNo;

    @OneToMany(mappedBy = "Shoe", cascade = CascadeType.PERSIST)
    private List<Shoe> ShoeList = new ArrayList<>();


    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public List<Shoe> getShoeList() {
        return ShoeList;
    }

    public void setShoeList(List<Shoe> shoeList) {
        ShoeList = shoeList;
    }
}
