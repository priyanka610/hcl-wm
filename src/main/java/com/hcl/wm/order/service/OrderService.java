package com.hcl.wm.order.service;

import com.hcl.wm.order.model.Order;
import com.hcl.wm.order.util.OrderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    MongoTemplate template;

    @Autowired
    private OrderUtil testData;

    public List<Order> getOrders() {
        //TODO: call repository method to get list of orders from db
        return testData.createOrder();
    }

    public String getInvoice(String orderId) {
        return testData.pdf;
    }

    public String getInvoiceFromDb(String orderId) {
        Query query = new Query().addCriteria(Criteria.where("orderId").is("1"));
        List<Order> order = template.find(query, Order.class);
        return order.get(1).getInvoice();
    }

}
