package com.example.ShoeManagementSystem.Controller;

import com.example.ShoeManagementSystem.Service.OrderService;
import com.example.ShoeManagementSystem.bean.OrderException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/cashDeposit")
    double cashdeposit(@RequestBody long shono, double amt) {
        double bal=0;
        try {
            bal = orderService.deposit(shono, amt);
        }catch (OrderException t) {
            t.printStackTrace();
        }
        return bal;
    }

    @PostMapping("/withdrawCash")
    double withdrawCash(@RequestBody long shono, double amt) {
        double bal = 0;
        try {
            bal = orderService.withdraw(shono, amt);
        }catch (OrderException t) {
            t.printStackTrace();
        }
        return bal;
    }

    @PostMapping("/checkBalance")
    double checkBal(@RequestBody long shoNo) {
        return orderService.CheckBalance(shoNo);
    }
}