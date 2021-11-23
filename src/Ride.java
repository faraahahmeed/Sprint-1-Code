
import java.util.Scanner;
import java.util.UUID;
public class Ride extends Observer{
    private String Source;
    private String Destination;
    private String RideID;
    private float Cost;
    private boolean status;
    //private float riderate;
    private Offer [] offers ;
    DataManager dataManager = new DataManager();

    @Override
    public void update() {
        
    }

    public void StartRide (String source,String destination)
    {

         String RideID =UUID.randomUUID().toString();
        Source=source;
        Destination=destination;
        System.out.println("looking for driver..");
        //hena hab3t notify lel driver ba- source area low hy3ml accept
        //driver SetCost lel user
        if(/*user accept offer*/)
            System.out.println(RideID);
       else
        System.out.println("stil looking for driver");

    }

    public float SetCost (float cost)
    {
        Cost=cost;
        //return addOffer( h7ot driver id ,cost);
    }

    public boolean RideStatus (String rideIDid)
    {
        if (EndRide()=="yes") ////w5dah mn class driver
            return true;
        else
            return false;
    }

    public void DisplayRide()
    {
        dataManager.setDataType(new RidesData);
        dataManager.executeGet(RideID);
    }
    public float RateRide (float rate)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your Ride rating");
        rate= in.nextFloat();
        return rate;
    }
}
