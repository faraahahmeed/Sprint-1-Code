
import java.util.Scanner;
import java.util.UUID;
public class Ride extends NotifyManager
{
    private String Source;
    private String Destination;
    private String RideID;

    private Offer [] offers ;
    DataManager dataManager = new DataManager();
    Offer offer= new Offer();
    Driver driver=new Driver();
    NotifyManager notifyManager = new NotifyManager();

    public void StartRide (String source,String destination)
    {
        String RideID =UUID.randomUUID().toString();
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
        Operations operations= new RidesData();
        dataManager.setDataType(operations);
        dataManager.executeGet(RideID);
    }
    public float RateRide (float rating)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your Ride rating");
        rating= in.nextFloat();
        return rating;
    }
}
