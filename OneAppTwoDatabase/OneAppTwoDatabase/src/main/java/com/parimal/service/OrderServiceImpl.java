package com.parimal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parimal.model.Order;
import com.parimal.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService
{

	@Autowired
	private OrderRepo oRepo;

	@Override
	public Order saveOrder(Order order)
	{

		return oRepo.save(order);
	}

}
