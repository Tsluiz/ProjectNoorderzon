package nl.noorderzon.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tijd")
public class Tijd {

    @Column(name = "idtijd")
    @Id
    private int id;

    @Column(name = "dag")
    private String dag;

    @Column(name = "tijdstip")
    private String tijdstip;

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
        return tijdstip;
    }

    public void setTijdstip(String tijdstip) {
        this.tijdstip = tijdstip;
    }

    public Set<Voorstelling> getVoorstellingPerTijdslot() {
        return voorstellingPerTijdslot;
    }

    public void setVoorstellingPerTijdslot(Set<Voorstelling> voorstellingPerTijdslot) {
        this.voorstellingPerTijdslot = voorstellingPerTijdslot;
    }
}

