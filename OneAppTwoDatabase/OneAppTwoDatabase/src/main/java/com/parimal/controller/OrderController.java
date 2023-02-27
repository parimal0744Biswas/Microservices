package com.parimal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parimal.model.Order;
import com.parimal.service.OrderService;

@RestController
public class OrderController
{
	@Autowired
	private OrderService oService;

	@PostMapping("/save")
	public Order registerOrder(@RequestBody Order order)
	{
		return oService.saveOrder(order);
	}

}
