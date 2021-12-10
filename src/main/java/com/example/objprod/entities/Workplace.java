package com.example.objprod.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "workplaces")
public class Workplace {
    @Id
    @Column(name = "Workplace_id", nullable = false)
    private Integer id;

    @Column(name = "Zone", nullable = false)
    private Integer zone;

    @Column(name = "Type", nullable = false, length = 50)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getZone() {
        return zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Workplace{" +
                "id=" + id +
                ", zone=" + zone +
                ", type='" + type + '\'' +
                '}';
    }
}