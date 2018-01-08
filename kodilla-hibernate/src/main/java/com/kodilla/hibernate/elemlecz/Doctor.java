package com.kodilla.hibernate.elemlecz;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "DOCTORS")
public class Doctor {

    private int id;
    private String sName;

    public Doctor() {
    }

    public Doctor(String sName) {
        this.sName = sName;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId_doctor() {
        return id;
    }

    public void setId_doctor(int id) {
        this.id = id;
    }

    @Column(name = "NAME")
    public String getName() {
        return sName;
    }

    public void setName(String sName) {
        this.sName = sName;
    }
}
