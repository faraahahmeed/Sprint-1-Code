import java.util.ArrayList;

public class Driver extends User {
    private String nationalid;
    private String drivinglicense;
    private float ridecost;
    private String area;
    private float price;

    DataManager dm ;
    AdminUser adminUser;
    Ride ride;
    private ArrayList<String> favarea=new ArrayList<>();
    private ArrayList<Ride> rd = new ArrayList<>();
    Notification notification= new Notification();
    Offer offer;

    public void verified (Driver driver)
    {
        adminUser.VerifyRegistrations(driver);
    }

    public void setNationalid(String nationalid) {
        this.nationalid = nationalid;
    }
    public void setDrivinglicense(String drivinglicense) {
        this.drivinglicense = drivinglicense;
    }
    public String getNationalid() {
        return nationalid;
    }
    public String getDrivinglicense() {
        return drivinglicense;
    }
    public String getDriverid() {
        return getId();
    }
    public void Balance(float ridecost)
    {
        this.ridecost = ridecost;
    }


    /*public void setPrice(float price) {
        this.price = price;
    }*/


    public boolean endride(){
        return false;
    }
    public Ride listride(){
        return ride.getHistory();
    }
    /*@Override
    public void update() {
        System.out.println("new ride is requested, check it out");
    }*/

    public void addfavarea (String place){
        favarea.add(place);
    }
    public boolean Area(String p){
        boolean flag=false;
        for(int i=0; i<favarea.size();i++){
            if(p.equals(favarea.get(i)))
                flag=true;
        }

        return flag;

    }

    public ArrayList<Ride> getArrayListofRides() {
        return rd;
    }

    public void makeoffer(Ride r , float price) {
        offer.AddOffer(r,price);
        notification.sendoffer(offer);
    }

}

