package com.example.objprod.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class WorkerManufacturingId implements Serializable {
    private static final long serialVersionUID = -6691694685413068236L;
    @Column(name = "Worker_id", nullable = false)
    private Integer workerId;
    @Column(name = "manufacturing_id", nullable = false)
    private Integer manufacturingId;

    public Integer getManufacturingId() {
        return manufacturingId;
    }

    public void setManufacturingId(Integer manufacturingId) {
        this.manufacturingId = manufacturingId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerId, manufacturingId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        WorkerManufacturingId entity = (WorkerManufacturingId) o;
        return Objects.equals(this.workerId, entity.workerId) &&
                Objects.equals(this.manufacturingId, entity.manufacturingId);
    }
}