package com.sunny.apps.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductOrder {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;

  String key;

  Timestamp creationTimestamp;
  Timestamp updateTimestamp;

  Long createdBy;

  String status;

}
