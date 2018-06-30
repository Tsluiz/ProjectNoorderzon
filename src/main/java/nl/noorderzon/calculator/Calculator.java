package nl.noorderzon.calculator;

import nl.noorderzon.entities.Voorstelling;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Calculator {

    // the static value of the original capacity of the location
    //private int capacity; --> Via entity klassen data resterende plaatsen ophalen.
    // user input for quantity of reservations
    private int resQuantity;
    // number of seats left after reservation is made
    //private int available;
    // number of seats originally available (deze wordt verwijderd duidelijk is hoe we de data uit de DB kunnen halen.
    private int cap_loc;

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("nl.noorderzon.hibernate");

    /**
     * Create a class which calculates the available seats.
     * Input is generated form the SQL DB. This connection is WIP
     * "cap_loc" is the original capacity of a location
     */

    public Calculator(int quant_res) {
        cap_loc = 397; //deze is voor het testen van de methode. Moet vervangen worden door input DB
        resQuantity = quant_res; //dit moet user-input worden
        cap_loc = cap_loc - resQuantity;
    }

    public String getAvailable() {
        if (cap_loc > 0) {
            return "" + cap_loc;
        } else {
            return "No seats left";
        }


    }

    private Voorstelling getVoorstelling() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Voorstelling> query = em.createQuery("SELECT v FROM Voorstelling v WHERE v.id = :voorstellingId", Voorstelling.class);
            query.setParameter("voorstellingId", 1);
            return query.getSingleResult();
        } finally {
            em.close();
        }
    }

}


