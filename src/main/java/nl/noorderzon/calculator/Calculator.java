package nl.noorderzon.calculator;

public class Calculator {

    // the static value of the original capacity of the location
    //private int capacity; --> Via entity klassen data resterende plaatsen ophalen.
    // user input for quantity of reservations
    private int resQuantity;
    // number of seats left after reservation is made
    //private int available;
    // number of seats originally available (deze wordt verwijderd duidelijk is hoe we de data uit de DB kunnen halen.
    private int cap_loc;

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


    public void setAvailable(int available) {
        this.available = available;
    }


    public int getAvailable() {
        if (available >0) {
            return "" + available;
        } else {
            return "No seats left";
}

}


