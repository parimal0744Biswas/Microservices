package com.parimal.service;

import org.springframework.stereotype.Service;

import com.parimal.model.Order;

@Service
public interface OrderService
{

	Order saveOrder(Order order);

}
