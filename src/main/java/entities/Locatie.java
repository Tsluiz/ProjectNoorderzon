package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locatie")
public class Locatie {

    @Column(name = "naam", nullable = false)
    @Id
    private String naam;

    @Column(name = "capaciteit")
    private int maxCapaciteit;

    @OneToMany (mappedBy = "naam")
    private List<Artiest> artiestenVanDezeLocatie;


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

    public List<Artiest> getArtiestenVanDezeLocatie() {
        return artiestenVanDezeLocatie;
    }

    public void setArtiestenVanDezeLocatie(List<Artiest> artiestenVanDezeLocatie) {
        this.artiestenVanDezeLocatie = artiestenVanDezeLocatie;
    }
}


