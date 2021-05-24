package com.hcl.wm.order.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
public class Customer {
    private String cust_id;
    private String first_name;
    private String last_name;

}
