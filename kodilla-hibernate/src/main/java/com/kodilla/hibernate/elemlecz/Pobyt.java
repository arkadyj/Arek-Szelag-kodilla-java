package com.kodilla.hibernate.elemlecz;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
@Table(name = "POBYT")
public class Pobyt {



    private int id_pobyt;


    private String dt_visit;


    private Jos jos;

    public Pobyt(String dt_visit) {
        this.dt_visit = dt_visit;
    }

    public Pobyt() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID_POB", unique = true)
    public int getId_pobyt() {
        return id_pobyt;
    }

    @Column(name = "DT_VISIT")
    public String getDt_visit() {
        return dt_visit;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "JOS")
    public Jos getJos() {
        return jos;
    }

    public void setId_pobyt(int id_pobyt) {
        this.id_pobyt = id_pobyt;
    }

    public void setDt_visit(String dt_visit) {
        this.dt_visit = dt_visit;
    }

    public void setJos(Jos jos) {
        this.jos = jos;
    }
}
