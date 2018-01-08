package com.kodilla.hibernate.elemlecz;



import jdk.nashorn.internal.scripts.JO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "POBYT")
public class Pobyt {

    private int id;
    private String number;
    private Doctor doctor;
    //private Jos jos;

    public Pobyt() {
    }

    public Pobyt(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "NUMBER")
    public String getNumber() {
        return number;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "DOCTOR_ID")
    public Doctor getDoctor() {
        return doctor;
    }

    /*
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "JOS")
    public Jos getJos() {
        return jos;
    } */

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    //public void setJos(Jos jos) {
     //   this.jos = jos;
    //}
}
