package com.example.objprod.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "delivery_process")
public class DeliveryProcess {
    @Id
    @Column(name = "Delivery_id", nullable = false)
    private Integer id;

    @Column(name = "Destination", nullable = false, length = 50)
    private String destination;

    @Column(name = "Departure_time", nullable = false)
    private Instant departureTime;

    @Column(name = "address_departure", nullable = false, length = 50)
    private String addressDeparture;

    @Column(name = "arrival_time")
    private Instant arrivalTime;

    public Instant getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Instant arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getAddressDeparture() {
        return addressDeparture;
    }

    public void setAddressDeparture(String addressDeparture) {
        this.addressDeparture = addressDeparture;
    }

    public Instant getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Instant departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DeliveryProcess{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", addressDeparture='" + addressDeparture + '\'' +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}