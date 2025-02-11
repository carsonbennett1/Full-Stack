package com.carsonb.services;

import java.util.List;

import com.carsonb.models.OrderModel;

public interface OrdersBusinessServiceInterface {
    public void test();

    public List<OrderModel> getOrders();

    public void init();

    public void destroy();
    
} 
