package com.example.objprod.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MaterialManufacturingId implements Serializable {
    private static final long serialVersionUID = -8949202677813427077L;
    @Column(name = "manufacturing_id", nullable = false)
    private Integer manufacturingId;
    @Column(name = "Material_id", nullable = false)
    private Integer materialId;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getManufacturingId() {
        return manufacturingId;
    }

    public void setManufacturingId(Integer manufacturingId) {
        this.manufacturingId = manufacturingId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturingId, materialId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MaterialManufacturingId entity = (MaterialManufacturingId) o;
        return Objects.equals(this.manufacturingId, entity.manufacturingId) &&
                Objects.equals(this.materialId, entity.materialId);
    }

}