package com.example.objprod.entities;

import javax.persistence.*;

@Entity
@Table(name = "materials")
public class Material {
    @Id
    @Column(name = "Material_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Delivery_id")
    private DeliveryProcess delivery;

    @Column(name = "Type", nullable = false, length = 50)
    private String type;

    @Column(name = "Count", nullable = false)
    private Integer count;

    @Column(name = "Price", nullable = false)
    private Double price;

    @Column(name = "Provider", nullable = false, length = 50)
    private String provider;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DeliveryProcess getDelivery() {
        return delivery;
    }

    public void setDelivery(DeliveryProcess delivery) {
        this.delivery = delivery;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", delivery=" + delivery +
                ", type='" + type + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", provider='" + provider + '\'' +
                '}';
    }
}