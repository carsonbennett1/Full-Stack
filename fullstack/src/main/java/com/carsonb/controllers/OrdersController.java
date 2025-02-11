package com.carsonb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carsonb.models.OrderModel;
import com.carsonb.services.OrdersBusinessService;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    //Dependency injection
    // @Autowired --> "Go find this class"
    @Autowired
    OrdersBusinessService service;
    
    @GetMapping("/")
    public String showAllOrders(Model model){

        List<OrderModel> orders = service.getOrders();

        model.addAttribute("title", "Objectives");
        model.addAttribute("orders", orders);

        return "orders.html";
    }

}
