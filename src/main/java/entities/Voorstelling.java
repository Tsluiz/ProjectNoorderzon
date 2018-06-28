package entities;

import javax.persistence.*;

@Entity
@Table (name = "voorstelling")
public class Voorstelling {

    @ManyToOne
    @Id
    @JoinColumn (name = "naam")
    private Artiest id;

    @Column (name = "capaciteit")
    private int capaciteit;
//in de database is het type een varchar/string,
//maar kunnen we er dan nog wel mee rekenen?


    public Artiest getId() {
        return id;
    }

    public void setId(Artiest id) {
        this.id = id;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }
}

