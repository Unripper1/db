package com.example.objprod.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "material_manufacturing")
public class MaterialManufacturing {
    @EmbeddedId
    private MaterialManufacturingId id;

    public MaterialManufacturingId getId() {
        return id;
    }

    public void setId(MaterialManufacturingId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MaterialManufacturing{" +
                "id=" + id +
                '}';
    }
}