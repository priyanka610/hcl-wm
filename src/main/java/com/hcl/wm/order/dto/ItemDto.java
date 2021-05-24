package com.hcl.wm.order.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class ItemDto {
    private String item_id;
    private String rate;
    private String available_qty;
    private String item_name;
}
