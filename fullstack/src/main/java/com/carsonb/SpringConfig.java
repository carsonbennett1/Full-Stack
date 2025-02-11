package com.carsonb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.carsonb.services.OrdersBusinessService;
import com.carsonb.services.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {
    
    @Bean(name="orderBusinessService", initMethod = "init", destroyMethod = "destroy")
    public OrdersBusinessServiceInterface getOrderBusiness(){
        return new OrdersBusinessService();
    }

}
