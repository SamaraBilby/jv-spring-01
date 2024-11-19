package com.cursodevsuperior.aula.service;

import com.cursodevsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService _shippingService;

    public double total(Order order){
        double valueTotalWithDiscount= order.getBasic() - order.getBasic() * (order.getDiscount()/100);

        return valueTotalWithDiscount + _shippingService.shipment(valueTotalWithDiscount);
    }

}
