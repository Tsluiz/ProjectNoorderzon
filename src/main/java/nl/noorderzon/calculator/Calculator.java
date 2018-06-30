package nl.noorderzon.calculator;

public class Calculator {

    // the static value of the original capacity of the location
    private int capacity;
    // user input for quantity of reservations
    private int quantity;
    // number of seats left after reservation is made
    private int available;
    // number of seats originally available
    private DB_con cap_loc;

    /**
     * Create a class which calculates the available seats.
     * Input is generated form the SQL DB. This connection is WIP
     * "cap_loc" is the original capacity of a location
     */

    public Calculator(int quant_res) {
    cap_loc = 500; //deze is voor het testen van de methode. Moet vervangen worden door input DB
     capacity = cap_loc;
     quantity = quant_res; //dit moet user-input worden
     available = capacity - quantity;

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


