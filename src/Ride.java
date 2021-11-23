
import java.util.ArrayList;
import java.util.*;

public class Ride extends NotifyManager
{
    private String Source;
    private String Destination;
    private int RideID;

    private Offer [] offers ;
    private Offer offer= new Offer();
    private Driver driver=new Driver();
    private NotifyManager notifyManager = new NotifyManager();
    private List<Ride> list = new ArrayList<Ride>();
    private Random rd = new Random();

    public void save(Ride ride) {
        list.add(ride);
    }

    public int getNumberOfRides(){
        return list.size();
    }

    public Ride getHistory() {
        return (Ride) list;
    }

    public void StartRide (String source,String destination)
    {
        RideID = rd.nextInt();
        Source=source;
        Destination=destination;
        notifyManager.Notify();
    }

    public void SetCost (float cost)
    {
         offer.AddOffer(cost);
    }

    public boolean RideStatus (String rideIDid)
    {
        if (driver.endride()==true)

            return true;
        else
            return false;
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
}
