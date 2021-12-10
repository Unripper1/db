package com.example.objprod.entities;

import javax.persistence.*;

@Entity
@Table(name = "manufacturing_process")
public class ManufacturingProcess {
    @Id
    @Column(name = "manufacturing_id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Lens_id", nullable = false)
    private Lens lens;

    @Column(name = "Address", nullable = false, length = 50)
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    @Override
    public String toString() {
        return "ManufacturingProcess{" +
                "id=" + id +
                ", lens=" + lens +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}