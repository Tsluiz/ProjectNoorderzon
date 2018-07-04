package nl.noorderzon.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "locatie")
public class Locatie {

    @Column(name = "id")
    @Id
    private int id;

    @Column(name = "naam", nullable = false)
    private String naam;

    @Column(name = "capaciteit")
    private int maxCapaciteit;

    @OneToMany(mappedBy = "vasteLocatie")
    @JsonIgnore
    private Set<Artiest> artiestenVanDezeLocatie;

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

    public int getMaxCapaciteit() {
        return maxCapaciteit;
    }

    public void setMaxCapaciteit(int maxCapaciteit) {
        this.maxCapaciteit = maxCapaciteit;
    }

    public Set<Artiest> getArtiestenVanDezeLocatie() {
        return artiestenVanDezeLocatie;
    }

    public void setArtiestenVanDezeLocatie(Set<Artiest> artiestenVanDezeLocatie) {
        this.artiestenVanDezeLocatie = artiestenVanDezeLocatie;
    }
}


