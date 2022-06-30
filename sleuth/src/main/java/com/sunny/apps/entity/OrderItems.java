package com.sunny.apps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderItems {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;

  Long ItemId;
  Long ItemQuantity;
  String status;
  Long price;
  Long tax;

}
