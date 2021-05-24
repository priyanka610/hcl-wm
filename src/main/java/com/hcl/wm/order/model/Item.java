package com.hcl.wm.order.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
public class Item {
    private String item_id;
    private String rate;
    private String available_qty;
    private String item_name;
}
