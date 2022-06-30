package com.sunny.apps.service;

import com.sunny.apps.dto.Order;
import com.sunny.apps.dto.OrderRequest;

public interface OrderService {

  public Order placeOrder(OrderRequest orderRequest);

  public Order fetchOrder(String searchKey );



}
