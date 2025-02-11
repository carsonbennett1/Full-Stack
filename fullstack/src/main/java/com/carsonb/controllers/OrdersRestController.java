package com.carsonb.controllers;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsonb.models.OrderModel;
import com.carsonb.services.OrdersBusinessServiceInterface;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersRestController {

    //Dependency injection
    // @Autowired --> "Go find this class"

    OrdersBusinessServiceInterface service;

    // @Autowired
    public OrdersRestController(OrdersBusinessServiceInterface service){
        super();
        this.service = service;
    }
    
    @GetMapping("/")
    public List<OrderModel> showAllOrders(){

        List<OrderModel> orders = service.getOrders();


        return orders;
    }

}
