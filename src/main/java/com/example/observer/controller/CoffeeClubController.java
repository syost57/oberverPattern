package com.example.observer.controller;

import com.example.observer.subject.CoffeeSubscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeClubController {

    @Autowired
    private CoffeeSubscription coffeeSubscription;

    @PostMapping("/shipped")
    public HttpStatus coffeeShipped(){
        coffeeSubscription.notifyShipped(Boolean.TRUE);
        return HttpStatus.OK;
    }

    @PostMapping("/delivered")
    public HttpStatus coffeeDelivered(){
        coffeeSubscription.notifyDelivered(Boolean.TRUE);
        return HttpStatus.OK;
    }
}
