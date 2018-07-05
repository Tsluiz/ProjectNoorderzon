package nl.noorderzon.functies;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**The test class ReservationTest**/

public class ReservationTest {
    private Reservation res1;
    private Reservation res2;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private int capacity;

    /**
     * Constructor for the test class
     **/

    public ReservationTest(){
    }

    /*
     * Set up the test reservations
     * Called before every test method
     */

    @Before
    public void setUp() {
        res1 = new Reservation(5);
        res2 = new Reservation(2);
        capacity = 500;
    }

    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    /*
    Tears down the test setup.
    Method called after every test
     */

    @After
    public void tearDown(){
    }
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    /**
     * Test that a reservation item is correctly initialised (quantity).
     */
    @Test
    public void testInit() {
        Reservation res1 = new Reservation(5);
        assertEquals(5, res1.getQuant_res());
    }


    @Test
    public void out() {
        System.out.print("ValidReservation");
        assertEquals("ValidReservation", outContent.toString());
    }

    // als er vrijdag nog tijd is dan deze nog uitwerken
  /*  @Test
    public void testCalculate1(){
        Reservation res1 = new Reservation(4);
        capacity = capacity - getQuant_res;
        assertEquals(true, )
    }*/



}

