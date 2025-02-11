package com.carsonb.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.carsonb.models.OrderModel;

// Helps Autowired point to correct service
@Service
public class OrdersBusinessService2 implements OrdersBusinessServiceInterface{

    @Override
    public void test() {
        System.out.println("OrderBusinessService is working");
    }

    @Override
    public List<OrderModel> getOrders() {
        List<OrderModel> orders = new ArrayList<OrderModel>();

        orders.add(new OrderModel(0L, "AAA", "Ground Beef", 4.50f, 2));
        orders.add(new OrderModel(1L, "AAB", "Chicken Breast", 8.00f, 2));
        orders.add(new OrderModel(2L, "AAC", "Brown Rice", 10.00f, 2));
        orders.add(new OrderModel(3L, "AAD", "Salmon", 12.00f, 1));
        orders.add(new OrderModel(4L, "AAE", "Onion", 8.50f, 2));
        orders.add(new OrderModel(5L, "AAF", "Lettuce", 12.00f, 1));
        
        return orders;

    }

    @Override
    public void init() {
        System.out.println("Init method of Orders Business Service 2");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method of the Orders Business Service 2");
    }
    
}
