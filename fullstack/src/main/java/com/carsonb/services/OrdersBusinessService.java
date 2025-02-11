package com.carsonb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.carsonb.models.OrderModel;

// Helps Autowired point to correct service
@Service
@Primary
public class OrdersBusinessService implements OrdersBusinessServiceInterface{

    @Override
    public void test() {
        System.out.println("OrderBusinessService is working");
    }

    @Override
    public List<OrderModel> getOrders() {

        List<OrderModel> orders = new ArrayList<OrderModel>();; 

        orders.add(new OrderModel(0L, "000", "Sky Diving", 1500.0f, 3));
        orders.add(new OrderModel(1L, "001", "Run with Bulls", 500.0f, 12));
        orders.add(new OrderModel(2L, "002", "Go to Space", 15000.0f, 2));
        orders.add(new OrderModel(3L, "003", "Cliff Jumping", 750.0f, 5));
        orders.add(new OrderModel(4L, "004", "Zip Line", 340.0f, 4));
        orders.add(new OrderModel(5L, "005", "Scuba Diving", 440.0f, 8));
        
        return orders;

    }

    @Override
    public void init() {
        System.out.println("******** Init method of Orders Business Service");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method of the Orders Business Service");
    }
    
}
