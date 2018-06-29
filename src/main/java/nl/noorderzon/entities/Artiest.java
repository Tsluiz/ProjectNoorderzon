package nl.noorderzon.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "artiest")
public class Artiest {

    @Column (name = "naam")
    @Id
    private String naam;

    @Column (name = "genre")
    private String genre;

    @Column (name = "naam_voorstelling")
    private String naamVoorstelling;

    @ManyToOne
    @JoinColumn (name = "locatie_naam")
    private Locatie vasteLocatie;

    @OneToMany (mappedBy = "id")
    private List<Voorstelling> voorstellingenVanArtiest;


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNaamVoorstelling() {
        return naamVoorstelling;
    }

    public void setNaamVoorstelling(String naamVoorstelling) {
        this.naamVoorstelling = naamVoorstelling;
    }

    public List<Voorstelling> getVoorstellingenVanArtiest() {
        return voorstellingenVanArtiest;
    }

    public Locatie getLocatie() {
        return vasteLocatie;
    }

    public void setLocatie(Locatie locatie) {
        this.vasteLocatie = locatie;
    }

    public void setVoorstellingenVanArtiest(List<Voorstelling> voorstellingenVanArtiest) {
        this.voorstellingenVanArtiest = voorstellingenVanArtiest;


    }
}
