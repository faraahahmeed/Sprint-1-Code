
import java.util.ArrayList;
import java.util.*;

public class Ride
{
    private String Source;
    private String Destination;
    private int RideID;

    private Offer [] offers ;
    private Offer offer;
    private Driver driver;
    Passenger p;

    private List<Ride> list = new ArrayList<Ride>();
    private Random rd ;

    public void startRide(String Source , String Destination){
        this.Source=Source;
        this.Destination=Destination;

    }

    public void save(Ride ride) {
        list.add(ride);
    }

    public int getNumberOfRides(){
        return list.size();
    }

    public Ride getHistory() {
        return (Ride) list;
    }

    public String getSource ()
    {
        return Source;
    }

    public boolean RideStatus ()
    {
        if (driver.endride()==false) {
            System.out.println("Ride ended.");
            return false;
        }
        else
            return true;
    }

    public void DisplayRide()
    {
        list.get(RideID);
    }
    public float RateRide (float rating)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your Ride rating");
        rating= in.nextFloat();
        return rating;
    }
    public Passenger getpassenger() {
        return p;
    }

}
