import java.util.ArrayList;

public class Passenger extends User {
    private String passengerid;
    private Ride ride;
    private ArrayList<Offer> of=new ArrayList<>();

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid;
    }

    public String getPassengerid() {
        return passengerid;
    }

    public void RequestRide(String source, String destination) {
        ride.requestRide(source, destination);
    }

    public String DriverDetails(Driver driver) {
        return driver.getMobilenum();

    }

    public ArrayList<Offer> AcceptOffer() {
        return of;
    }

    public float Rating(float rate) {
        return ride.RateRide(rate);

    }

   /* @Override
    public void update() {
        System.out.println("new Offer added, check it out");
    }*/
}
