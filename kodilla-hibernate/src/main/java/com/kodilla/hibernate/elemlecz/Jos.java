package com.kodilla.hibernate.elemlecz;

import com.kodilla.hibernate.task.Task;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "JOS")
public class Jos {

    private int id;
    private String name;
    private List<Pobyt> pobytList = new ArrayList<>();


    public Jos() {
    }

    public Jos(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "JOS_ID")
    public List<Pobyt> getPobytList() {
        return pobytList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPobytList(List<Pobyt> pobytList) {
        this.pobytList = pobytList;
    }
}
