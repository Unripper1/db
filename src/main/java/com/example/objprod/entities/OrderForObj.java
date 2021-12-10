package com.example.objprod.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "order_for_obj")
public class OrderForObj {
    @Id
    @Column(name = "Order_id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Lens_id", nullable = false)
    private Lens lens;

    @ManyToOne
    @JoinColumn(name = "Delivery_id")
    private DeliveryProcess delivery;

    @Column(name = "Date_of_appeal", nullable = false)
    private LocalDate dateOfAppeal;

    @Column(name = "Price", nullable = false)
    private Double price;

    @Column(name = "Count", nullable = false)
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDateOfAppeal() {
        return dateOfAppeal;
    }

    public void setDateOfAppeal(LocalDate dateOfAppeal) {
        this.dateOfAppeal = dateOfAppeal;
    }

    public DeliveryProcess getDelivery() {
        return delivery;
    }

    public void setDelivery(DeliveryProcess delivery) {
        this.delivery = delivery;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderForObj{" +
                "id=" + id +
                ", customer=" + customer +
                ", lens=" + lens +
                ", delivery=" + delivery +
                ", dateOfAppeal=" + dateOfAppeal +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}