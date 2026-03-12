package com.telusko.SprinfEcom.model.dto;

import java.math.BigDecimal;

public record OrderItemRequest(
        int productId,
        int quantity

) {

}
