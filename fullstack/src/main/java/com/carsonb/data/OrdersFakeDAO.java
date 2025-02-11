package com.carsonb.data;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import org.springframework.stereotype.Repository;

import com.carsonb.models.OrderModel;
// Name of a managed bean
@Repository
public class OrdersFakeDAO implements OrdersDataAccessInterface{

    List<OrderModel> orders = new ArrayList<OrderModel>(); 

    public OrdersFakeDAO(){
        orders.add(new OrderModel(0L, "000", "Sky Diving", 1500.0f, 3));
        orders.add(new OrderModel(1L, "001", "Run with Bulls", 500.0f, 12));
        orders.add(new OrderModel(2L, "002", "Go to Space", 15000.0f, 2));
        orders.add(new OrderModel(3L, "003", "Cliff Jumping", 750.0f, 5));
        orders.add(new OrderModel(4L, "004", "Zip Line", 340.0f, 4));
        orders.add(new OrderModel(5L, "005", "Scuba Diving", 440.0f, 8));
        
    }


    @Override
    public OrderModel getById(long id) {


        return null;
    }

    @Override
    public List<OrderModel> getOrders() {
        return orders;
    }

    @Override
    public List<OrderModel> searchOrders(String searchTerm) {

        List<OrderModel> foundItems = new ArrayList<OrderModel>();

        for(int i = 0; i < orders.size(); i++){
            if(orders.get(i).getProductName().toLowerCase().contains(searchTerm)){
                foundItems.add(orders.get(i));
            }
        }

        return foundItems;
    }

    @Override
    public long addOne(OrderModel newOrder) {


        return null;
    }

    @Override
    public boolean deleteOne(long id) {


        return null;
    }

    @Override
    public OrderModel updateOne(long idToUpdate, OrderModel updateOrder) {


        return null;
    }
    
}
