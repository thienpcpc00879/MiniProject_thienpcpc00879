package com.thienpcpc00879_MiniProject.service;

import java.util.List;


import com.fasterxml.jackson.databind.JsonNode;
import com.thienpcpc00879_MiniProject.Entity.Order;

public interface OrderService {

	Order create(JsonNode orderData);

	Order findById(Long id);

	List<Order> findByUsername(String username);



}
