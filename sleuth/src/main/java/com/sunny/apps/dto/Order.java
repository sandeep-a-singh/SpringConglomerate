package com.sunny.apps.dto;

import java.io.Serializable;

public class Order implements Serializable {

  public String orderStatus;

  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }
}
