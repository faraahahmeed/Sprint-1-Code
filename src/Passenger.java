public class Passenger extends User implements Observer
{
    private String passengerid;
    private Ride ride = new Ride();

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid;
    }

    public String getPassengerid() {
        return passengerid;
    }

    public void RequestRide(String source, String destination) {
        Ride ride = new Ride();
        ride.StartRide(source, destination);
    }

    public String DriverDetails(Driver driver) {
        return driver.getMobilenum();

    }

    public boolean AcceptOffer() {
        return true;
    }

    public float Rating(float rate) {
        return ride.RateRide(rate);

    }
    @Override
    public void update() {
        System.out.println("new Offer added, check it out");
    }
}
