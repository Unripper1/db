package com.example.objprod.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Table(name = "work_shift")
public class WorkShift {
    @Id
    @Column(name = "Work_shift_id", nullable = false)
    private Integer id;

    @Column(name = "start")
    private LocalTime start;

    @Column(name = "end")
    private LocalTime end;

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WorkShift{" +
                "id=" + id +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}