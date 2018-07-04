package nl.noorderzon.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "artiest")
public class Artiest {

    @Column(name = "id")
    @Id
    private int id;

    @Column (name = "naam")
    private String naam;

    @Column (name = "genre")
    private String genre;

    @Column (name = "naam_voorstelling")
    private String naamVoorstelling;

    @ManyToOne
    @JoinColumn(name = "locatie_id")
    private Locatie vasteLocatie;

    @OneToMany(mappedBy = "artiest")
    @JsonIgnore
    private Set<Voorstelling> voorstellingenVanArtiest;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

//    public Set<Voorstelling> getVoorstellingenVanArtiest() {
    //       return voorstellingenVanArtiest;
    //   }

    public Locatie getLocatie() {
        return vasteLocatie;
    }

    public void setLocatie(Locatie locatie) {
        this.vasteLocatie = locatie;
    }

//    public void setVoorstellingenVanArtiest(Set<Voorstelling> voorstellingenVanArtiest) {
//        this.voorstellingenVanArtiest = voorstellingenVanArtiest;
//    }
}

