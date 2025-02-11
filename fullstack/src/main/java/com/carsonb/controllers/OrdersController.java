package com.carsonb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carsonb.models.OrderModel;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    
    @GetMapping("/")
    public String showAllOrders(Model model){

        List<OrderModel> orders = new ArrayList<OrderModel>();

        orders.add(new OrderModel(0L, "000", "Sky Diving", 1500.0f, 3));
        orders.add(new OrderModel(1L, "001", "Run with Bulls", 500.0f, 12));
        orders.add(new OrderModel(2L, "002", "Go to Space", 15000.0f, 2));
        orders.add(new OrderModel(3L, "003", "Cliff Jumping", 750.0f, 5));
        orders.add(new OrderModel(4L, "004", "Zip Line", 340.0f, 4));
        orders.add(new OrderModel(5L, "005", "Scuba Diving", 440.0f, 8));
        
        model.addAttribute("title", "Objectives");
        model.addAttribute("orders", orders);

        return "orders.html";
    }

}
