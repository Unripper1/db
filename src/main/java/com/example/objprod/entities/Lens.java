package com.example.objprod.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lens")
public class Lens {
    @Id
    @Column(name = "Lens_id", nullable = false)
    private Integer id;

    @Column(name = "Diaphragm", nullable = false, length = 50)
    private String diaphragm;

    @Column(name = "Bayonet", nullable = false, length = 50)
    private String bayonet;

    @Column(name = "Barrel", nullable = false, length = 50)
    private String barrel;

    @Column(name = "Processor", nullable = false, length = 50)
    private String processor;

    @Column(name = "Objective_lens", nullable = false, length = 50)
    private String objectiveLens;

    @Column(name = "mirror", length = 50)
    private String mirror;

    public String getMirror() {
        return mirror;
    }

    public void setMirror(String mirror) {
        this.mirror = mirror;
    }

    public String getObjectiveLens() {
        return objectiveLens;
    }

    public void setObjectiveLens(String objectiveLens) {
        this.objectiveLens = objectiveLens;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getBarrel() {
        return barrel;
    }

    public void setBarrel(String barrel) {
        this.barrel = barrel;
    }

    public String getBayonet() {
        return bayonet;
    }

    public void setBayonet(String bayonet) {
        this.bayonet = bayonet;
    }

    public String getDiaphragm() {
        return diaphragm;
    }

    public void setDiaphragm(String diaphragm) {
        this.diaphragm = diaphragm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Lens{" +
                "id=" + id +
                ", diaphragm='" + diaphragm + '\'' +
                ", bayonet='" + bayonet + '\'' +
                ", barrel='" + barrel + '\'' +
                ", processor='" + processor + '\'' +
                ", objectiveLens='" + objectiveLens + '\'' +
                ", mirror='" + mirror + '\'' +
                '}';
    }
}