package nl.noorderzon.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tijdstip")
public class Tijdstip {

    @Column(name = "id")
    @Id
    private int id;

    @Column(name = "dag")
    private String dag;

    @Column(name = "tijd")
    private String tijd;

    @OneToMany(mappedBy = "tijdstip")
    @JsonIgnore
    private Set<Voorstelling> voorstellingPerTijdslot;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDag() {
        return dag;
    }

    public void setDag(String dag) {
        this.dag = dag;
    }

    public String getTijdstip() {
        return tijd;
    }

    public void setTijdstip(String tijd) {
        this.tijd = tijd;
    }

    public Set<Voorstelling> getVoorstellingPerTijdslot() {
        return voorstellingPerTijdslot;
    }

    public void setVoorstellingPerTijdslot(Set<Voorstelling> voorstellingPerTijdslot) {
        this.voorstellingPerTijdslot = voorstellingPerTijdslot;
    }
}

