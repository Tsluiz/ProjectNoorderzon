package entities;


import javax.persistence.*;

@Entity
@Table (name = "tijd")
public class Tijd {

    @Column (name = "iddag")
    @Id
    private int id;

    @Column (name = "dag")
    private String dag;

    @Column (name = "tijdstip")
    private String tijdstip;

    @ManyToOne
    @JoinColumn (name = "id")
    private Voorstelling voorstellingPerTijdslot;

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

    public Voorstelling getVoorstellingPerTijdslot() {
        return voorstellingPerTijdslot;
    }

    public void setVoorstellingPerTijdslot(Voorstelling voorstellingPerTijdslot) {
        this.voorstellingPerTijdslot = voorstellingPerTijdslot;
    }
}

