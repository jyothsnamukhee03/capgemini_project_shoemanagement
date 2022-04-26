package com.example.ShoeManagementSystem.Service;

import com.example.ShoeManagementSystem.bean.Shoe;
import com.example.ShoeManagementSystem.bean.Order;
import com.example.ShoeManagementSystem.bean.OrderException;
import com.example.ShoeManagementSystem.repository.OrderRepository;
import com.example.ShoeManagementSystem.repository.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ShoeRepository shoeRepository;

    public double CheckBalance(long shoNo) {
        Shoe sho = shoeRepository.findById(shoNo).get();
        double bal = sho.getPrice();
        return bal;
    }

    public double withdraw(long ShoNo, double amt) throws OrderException{
        Shoe sho = shoeRepository.findById(ShoNo).get();
        double bal = sho.getPrice();
        if(amt > bal) {
            throw new OrderException("Insufficient Balance...");
        }
        else {
            bal = bal - amt;
            Order t = new Order();
            t.setPrice(bal);
            t.getOrderDate().getTime();
            orderRepository.save(t);
            return bal;
        }
    }

    public double deposit(long Shono, double amt) throws OrderException {
        if( amt == 0) {
            throw new OrderException("Please enter valid amount");
        }
        else {
            Shoe sho = shoeRepository.findById(Shono).get();
            double bal = sho.getPrice();
            bal = bal + amt;
            return bal;
        }
    }

}