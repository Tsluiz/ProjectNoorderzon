package nl.noorderzon.calculator;

import nl.noorderzon.Application;
import nl.noorderzon.entities.Voorstelling;
import org.springframework.boot.SpringApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Calculator {

    // the static value of the original capacity of the location
    //private int capacity; --> Via entity klassen data resterende plaatsen ophalen.
    // user input for quantity of reservations
    //private int resQuantity;
    // number of seats left after reservation is made
    //private int available;
    // number of seats originally available (deze wordt verwijderd duidelijk is hoe we de data uit de DB kunnen halen.
    private int capacity;
    private boolean validReservation;

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("nl.noorderzon.hibernate");

    /**
     * Create a class which calculates the available seats.
     * Input is generated form the SQL DB. This connection is WIP
     * "cap_loc" is the original capacity of a location
     */
    public Calculator(int quant_res) {
        Calculate(quant_res);
        System.out.println("ValidReservation = " + validReservation);
        System.out.println("Capacity = " + capacity);
    }

    // Main aangemaakt om te testen
    public static void main(String[] args) {
        Calculator c = new Calculator(4);
    }

    public void Calculate(int quant_res) {
        capacity = getVoorstelling().getCapaciteit(); //deze is voor het testen van de methode. Moet vervangen worden door input DB
        if (quant_res <= capacity) {
            capacity = capacity - quant_res;
            validReservation = true;
        } else {
            validReservation = false;
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

    /**
     * public String getAvailable() {
     * if (cap_loc > 0) {
     * return "" + cap_loc;
     * } else {
     * return "No seats left";
     * }
     * }
     */

    public int getCapacity() {
        return capacity;
    }

    public boolean isValidReservation() {
        return validReservation;
    }

}


