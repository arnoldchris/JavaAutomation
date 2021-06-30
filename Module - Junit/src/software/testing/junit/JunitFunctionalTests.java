package software.testing.junit;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitFunctionalTests {

    /*
    Login
    Book a ticket
    Check in
    Cancel Ticket
    Logout
     */
    //Get runs only once at the beginning of the class (Before any tests that going to run)
    @BeforeClass
    public static void loadTestData(){
        //Clear old cache
        //load new data for checkin and cancel
        System.out.println("Loading Test Data");
    }

    //Will run at the beginning of each Test
    @Before
    public void login(){
        System.out.println("Logging in to the application..");
    }

    @Test
    public void C_bookTicket(){
        System.out.println("Booking a ticket");
    }

    @Test
    public void B_checkIn(){
        System.out.println("Checking IN ...");
    }
    @Test
    public void A_cancelTicket(){
        System.out.println("Cancelling a Ticket..");
    }
    //Will run at the end of each test.
    @After
    public  void logout(){
        System.out.println("Logging out of the application...");
    }

    //Will run only once at the end of the class
    @AfterClass
    public static void tearDown(){
        //Close connections, flush objects from the memory

        System.out.println("Tidying up...");
    }
    /*
    for loop to read each line form the excel file
    create xml from each line of data
    post xml
    assert results

     */
}
