package com.sunny.apps.dto;

import java.io.Serializable;

public class OrderItem implements Serializable {

  public String getItemKey() {
    return itemKey;
  }

  public void setItemKey(String itemKey) {
    this.itemKey = itemKey;
  }

  String itemKey;

  @Override
  public String toString() {
    return "OrderItem{" +
        "itemKey='" + itemKey + '\'' +
        '}';
  }
}
