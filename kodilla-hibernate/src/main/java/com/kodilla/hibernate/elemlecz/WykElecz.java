package com.kodilla.hibernate.elemlecz;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "WYKELECZ")
public class WykElecz {

    private int id_wykElecz;
    private List<Pobyt> pobytList;

    public WykElecz() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID_WYKELECZ", unique = true)
    public int getId_wykElecz() {
        return id_wykElecz;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "POBYT")
    public List<Pobyt> getPobytList() {
        return pobytList;
    }

    public void setId_wykElecz(int id_wykElecz) {
        this.id_wykElecz = id_wykElecz;
    }

    public void setPobytList(List<Pobyt> pobytList) {
        this.pobytList = pobytList;
    }
}
