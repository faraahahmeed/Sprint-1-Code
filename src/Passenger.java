import java.util.ArrayList;

public class Passenger extends User {
    private String passengerid;
    Ride ride ;

    private ArrayList<Offer> offers=new ArrayList<>();
    Notification notification= new Notification();
    ArrayList<Passenger> list= new ArrayList<Passenger>();
    LocationService locationservice=new LocationService();


    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid;
    }

    public String getPassengerid() {
        return passengerid;
    }

    public ArrayList<Offer> AcceptOffer() {
        return offers;
    }

    /*public double Rating(double rate) {
        return ride.RateRide(rate);

    }*/

    public void RequestRide(Ride ride,String source , String dest){
        ride.startRide(source,dest);
        notification.sendnotify(ride);
        locationservice.trackcalls();
    }
    public void checkloginForpassenger() {
        for(int i=0;i<list.size();i++){
            if((list.get(i).getUsername().equals(this.getUsername()))){
                if(list.get(i).getPassword().equals(this.getPassword())){
                    System.out.println("logged in");
                    break;
                }
            }
            else if(!(list.get(i).getUsername().equals(getUsername())))
            {
                if((list.size()-i)==1){
                    System.out.println("invalid username or password ");
                    System.exit(0);
                }
                else {
                    continue;
                }
            }
            else if (list.size()==0){
                System.out.println("The driver List is Empty ");
                System.exit(0);
            }
        }
    }
}
