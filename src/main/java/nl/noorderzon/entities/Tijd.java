package nl.noorderzon.entities;


import javax.persistence.*;
import java.util.List;

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
    private List<Voorstelling> voorstellingPerTijdslot;


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

    public List<Voorstelling> getVoorstellingPerTijdslot() {
        return voorstellingPerTijdslot;
    }

    public void setVoorstellingPerTijdslot(List<Voorstelling> voorstellingPerTijdslot) {
        this.voorstellingPerTijdslot = voorstellingPerTijdslot;
    }
}

