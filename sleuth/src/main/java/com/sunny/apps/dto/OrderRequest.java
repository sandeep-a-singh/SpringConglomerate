package com.sunny.apps.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderRequest implements Serializable {
  @JsonProperty(value = "orderItems")
  List<OrderItem> orderItems;

  public List<OrderItem> getItems() {
    return orderItems;
  }

  public void setItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }

  @Override
  public String toString() {
    return "OrderRequest{" +
        "orderItems=" + orderItems +
        '}';
  }
}
