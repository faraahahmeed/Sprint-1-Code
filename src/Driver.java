import java.util.ArrayList;
public class Driver extends User {
    private String nationalid;
    private String drivinglicense;
    /*private float ridecost;
    private String area;
    private float price;*/
    ArrayList<Driver> pending=new ArrayList<>();
    ArrayList<Driver> list= new ArrayList<Driver>();

    /*DataManager dm ;
    AdminUser adminUser;*/
    Ride ride;
    private ArrayList<String> favarea=new ArrayList<>();
    private ArrayList<Ride> rd = new ArrayList<>();
    Notification notification= new Notification();
    Offer offer;

   /* public void verified (Driver driver)
    {
        adminUser.VerifyRegistrations(driver);
    }*/

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
    /*public void Balance(float ridecost)
    {
        this.ridecost = ridecost;
    }*/

    public boolean endride(){
        return false;
    }
    public Ride listride(){
        return ride.getHistory();
    }


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

    public void makeoffer(float price) {
        offer.AddOffer(price);
        notification.sendoffer(offer);
    }

    public void checkloginFordriver() {
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

