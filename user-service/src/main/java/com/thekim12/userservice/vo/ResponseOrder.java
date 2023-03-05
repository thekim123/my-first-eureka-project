package com.thekim12.userservice.vo;

import lombok.Data;

@Data
public class ResponseOrder {
    private String productId;
    private Integer quantity;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
}
