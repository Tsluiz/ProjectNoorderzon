package nl.noorderzon.entities;

import javax.persistence.*;

@Entity
@Table (name = "voorstelling")
public class Voorstelling {

    @Column (name = "idvoorstelling")
    @Id
    private int id;

    @Column(name = "resterende_plaatsen")
    private int capaciteit;
//in de database is het type een varchar/string,
//maar kunnen we er dan nog wel mee rekenen?


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

}

