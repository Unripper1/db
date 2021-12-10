package com.example.objprod.entities;

import javax.persistence.*;

@Entity
@Table(name = "tools")
public class Tool {
    @Id
    @Column(name = "Tools_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Workplace_id")
    private Workplace workplace;

    @Column(name = "Type", nullable = false, length = 50)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Workplace getWorkplace() {
        return workplace;
    }

    public void setWorkplace(Workplace workplace) {
        this.workplace = workplace;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "id=" + id +
                ", workplace=" + workplace +
                ", type='" + type + '\'' +
                '}';
    }
}