package com.cursodevsuperior.aula;

import com.cursodevsuperior.aula.entities.Order;
import com.cursodevsuperior.aula.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private OrderService _orderService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309,95.90,0.00);
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor Total: " +  _orderService.total(order));


	}
}
