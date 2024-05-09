package com.microservice.inventory.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventory {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String productId;
    private Integer quantity;
    public String getProductId() {
        return productId;
    }
    public void setProductId( String productId) {
        this.productId = productId;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
