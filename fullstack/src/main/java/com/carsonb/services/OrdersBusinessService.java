package com.carsonb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.carsonb.data.OrdersDataAccessInterface;
import com.carsonb.models.OrderModel;

// Helps Autowired point to correct service
@Service
@Primary
public class OrdersBusinessService implements OrdersBusinessServiceInterface{

    @Autowired
    OrdersDataAccessInterface ordersDAO;

    @Override
    public void test() {
        System.out.println("OrderBusinessService is working");
    }

    @Override
    public List<OrderModel> getOrders() {

        return ordersDAO.getOrders();

    }

    @Override
    public void init() {
        System.out.println("******** Init method of Orders Business Service");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method of the Orders Business Service");
    }

    @Override
    public OrderModel getById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<OrderModel> searchOrders(String searchTerm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchOrders'");
    }

    @Override
    public long addOne(OrderModel newOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addOne'");
    }

    @Override
    public boolean deleteOne(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteOne'");
    }

    @Override
    public OrderModel updateOne(long idToUpdate, OrderModel updateOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOne'");
    }
    
}
