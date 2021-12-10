package com.example.objprod.entities;

import javax.persistence.*;

@Entity
@Table(name = "workers")
public class Worker {
    @Id
    @Column(name = "Worker_id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Work_shift_id", nullable = false)
    private WorkShift workShift;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Workplace_id", nullable = false)
    private Workplace workplace;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Column(name = "Surname", nullable = false, length = 50)
    private String surname;

    @Column(name = "Post", nullable = false, length = 50)
    private String post;

    @Column(name = "Phone")
    private Integer phone;

    @Column(name = "salary")
    private Integer salary;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workplace getWorkplace() {
        return workplace;
    }

    public void setWorkplace(Workplace workplace) {
        this.workplace = workplace;
    }

    public WorkShift getWorkShift() {
        return workShift;
    }

    public void setWorkShift(WorkShift workShift) {
        this.workShift = workShift;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", workShift=" + workShift +
                ", workplace=" + workplace +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", post='" + post + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                '}';
    }
}