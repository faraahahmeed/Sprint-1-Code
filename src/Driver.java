public class Driver extends User implements Observer
{
    private String nationalid;
    private String drivinglicense;
    private float ridecost;
    private String area;
    private float price;

    //NotifyManager notifyManager = new NotifyManager();

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
    public void FavoriteArea(String Area)
    {
        this.area = Area;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public boolean endride(){
        return false;
    }
    public Ride listride(){
       return null;
    }
    @Override
    public void update() {
        System.out.println("new ride is requested, check it out");
    }

}

