package nl.noorderzon.entities;

import javax.persistence.*;

@Entity
@Table (name = "voorstelling")
public class Voorstelling {

    @Column(name = "id")
    @Id
    private int id;

    @Column(name = "resterende_plaatsen")
    private int capaciteit;
//in de database is het type een varchar/string,
//maar kunnen we er dan nog wel mee rekenen?

    @ManyToOne
    @JoinColumn(name = "artiest_id")
    private Artiest artiest;

    @ManyToOne
    @JoinColumn(name = "tijdstip_id")
    private Tijdstip tijdstip;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public Artiest getArtiest() {
        return artiest;
    }

    public void setArtiest(Artiest artiest) {
        this.artiest = artiest;
    }

    public Tijdstip getTijdstip() {
        return tijdstip;
    }

    public void setTijdstip(Tijdstip tijdstip) {
        this.tijdstip = tijdstip;
    }

}

