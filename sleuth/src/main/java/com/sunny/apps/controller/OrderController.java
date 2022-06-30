package com.sunny.apps.controller;


import com.sunny.apps.dto.Order;
import com.sunny.apps.dto.OrderRequest;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE,
                method = RequestMethod.POST,
                path = "/order")
public class OrderController {

  private static final Logger LOGGER = Logger.getLogger(OrderController.class.getCanonicalName());

  @PostMapping(path = "/place")
  public ResponseEntity<Order> placeOrder(@RequestBody OrderRequest request) {
    LOGGER.log(Level.INFO, "Request Received => " +request.toString());

    return ResponseEntity.ok().body(new Order());
  }


}
