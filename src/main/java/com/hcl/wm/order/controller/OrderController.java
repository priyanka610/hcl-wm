package com.hcl.wm.order.controller;

import com.hcl.wm.order.dto.OrderDto;
import com.hcl.wm.order.mapper.OrderMapper;
import com.hcl.wm.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @Autowired
    private OrderMapper mapper;

    @GetMapping("/getOrderList")
    List<OrderDto> getOrders() {
        return mapper.toDtoList(this.service.getOrders());
    }

    @GetMapping("/getInvoice/{orderId}")
    String getInvoice(String orderId) {
        return this.service.getInvoice(orderId);
    }
}
