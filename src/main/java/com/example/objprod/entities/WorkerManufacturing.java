package com.example.objprod.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "worker_manufacturing")
public class WorkerManufacturing {
    @EmbeddedId
    private WorkerManufacturingId id;

    public WorkerManufacturingId getId() {
        return id;
    }

    public void setId(WorkerManufacturingId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WorkerManufacturing{" +
                "id=" + id +
                '}';
    }
}