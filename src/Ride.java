
import java.util.ArrayList;
import java.util.*;

public class Ride
{
    private String Source;
    private String Destination;
   
    double rating;
    int id;
 
    private Offer offer;
    private Driver driver;
    float cost;
    Passenger p = new Passenger();
    Notification notification=new Notification();
    Ride ridee;
    private List<Ride> list = new ArrayList<>();
    private ArrayList<Ride> endRides= new ArrayList<>();
    

    public void startRide(String Source , String Destination){
        this.Source=Source;
        this.Destination=Destination;
        cost=offer.getPrice();
        notification.sendnotifywhenuseracceptoffer(ridee);

    }
    public void setId(int id) {
        this.id = id;
    }
    public Ride get(int id) {
        return list.get(id);
    }
    public void save(Ride ride) {
        ride.setId(getNumberOfRide());
        list.add(ride);
    }

    public int getNumberOfRide(){
        return list.size();
    }

    public void RideHistory(Ride ride) { ////Ride bdl void??
          endRides.add(ride);
    }

    public String getSource ()
    {
        return Source;
    }

    public String getDestination ()
    {
        return Destination;
    }

    public boolean RideStatus ()
    {
        if (driver.completeride()==true) {
            System.out.println("Ride ended.");
            return true;
        }
        else{
            System.out.println("ongoing ride");
            return false;}
    }

    public String displayRide() {
        return "Source= " + this.getSource() + "\nDestination= "
                + this.getDestination() + "\nCost= " + this.offer.getPrice()
                + "\nDriver= " + this.driver.getUsername();
    }
    public void RateRide (double rating)
    { if(RideStatus()==true) {
        this.rating=rating;
        }
    }

    public void israted()
    {

    }
    public Passenger getpassenger() {
        return p;
    }

    public String DriverDetails(Driver driver) {
        return driver.getUsername() + driver.getMobilenum();
    }


}
