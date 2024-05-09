package com.microservice.inventory.DTO;

import com.microservice.inventory.utils.InventoryStatus;

public class InventoryResponseDTO {
    private String userId;
    private String productId;
    private String orderId;
    private InventoryStatus status; // <- available | unavailable

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId( String productId) {
        this.productId = productId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId( String orderId) {
        this.orderId = orderId;
    }

    public InventoryStatus getStatus() {
        return status;
    }

    public void setStatus(InventoryStatus status) {
        this.status = status;
    }
}