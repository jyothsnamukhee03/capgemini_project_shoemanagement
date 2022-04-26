package com.example.ShoeManagementSystem.bean;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Shoe")
public class Shoe {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long shoeNumber;
    String shoeType;
    double price;

    @ManyToOne
    @JoinColumn(name = "userId")
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getShoeNumber() {
        return shoeNumber;
    }

    public void setShoeNumber(long shoeNumber) {
        this.shoeNumber = shoeNumber;
    }

    public String getShoeType() {
        return shoeType;
    }

    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}