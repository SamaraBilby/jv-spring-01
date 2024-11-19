package com.cursodevsuperior.aula.service;

import com.cursodevsuperior.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment (double total){
         double valueShipment = 0.00;
         if(total < 100){
             valueShipment = 20.00;
         } else if (total >= 100 && total < 200) {
             valueShipment = 12.00;
        } else {
             valueShipment = 0;
         }
         return  valueShipment;
    }
}
