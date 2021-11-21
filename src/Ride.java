
import java.util.UUID;
public class Ride {
    private String Source;
    private String Destination;
    private String RideID;
    private float Cost;
    private boolean status;
    private float riderate;
    //private Offers [] offers ;
    DataManager dataManager;

    public void StartRide (String source,String destination)//, String rideid )
    {

         String RideID =UUID.randomUUID().toString();
        Source=source;
        Destination=destination;
        System.out.println("looking for driver..");
        //hena hab3t notify lel driver ba- source area low hy3ml accept
        //driver SetCost lel user
        if(/*user accept offer*/)
            System.out.println(RideID);
       /* else
        System.out.println("stil looking for driver");*/0

    }

    public float SetCost (float cost)
    {
        Cost=cost;
        //return addOffer( h7ot driver id ,cost);
    }

    public boolean RideStatus (String id)
    {
        if (EndRide()=="yes") ////
            System.out.println("ride ended");
        else
            System.out.println("ongoing");
    }

    public void DisplayRide()
    {
        dataManager.setDataType(new RidesData);
        dataManager.executeGet(RideID);
    }
    public float RateRide (float rate)
    {
        riderate=rate;
        return rate;
    }
}
