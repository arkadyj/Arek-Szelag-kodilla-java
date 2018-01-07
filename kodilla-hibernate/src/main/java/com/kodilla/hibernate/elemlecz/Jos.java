package com.kodilla.hibernate.elemlecz;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "JOS")
public class Jos {


    private int id_jos;

    private String name;


    //private List<Pobyt> pobytList;

    public Jos() {
    }

    public Jos(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID_JOS", unique = true)
    public int getId_jos() {
        return id_jos;
    }

    @Column(name = "JOS_NAME")
    public String getName() {
        return name;
    }

    /*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "POBYT")
    public List<Pobyt> getPobytList() {
        return pobytList;
    } */

    public void setId_jos(int id_jos) {
        this.id_jos = id_jos;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public void setPobytList(List<Pobyt> pobytList) {
        //this.pobytList = pobytList;
    //}
}
