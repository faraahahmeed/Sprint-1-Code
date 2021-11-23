public class Driver extends User {
    private String nationalid;
    private String drivinglicense;
    private String driverid;
    private float ridecost;
    private String area;
    private float price;

    public void setNationalid(String nationalid) {
        this.nationalid = nationalid;
    }
    public void setDrivinglicense(String drivinglicense) {
        this.drivinglicense = drivinglicense;
    }
    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }
    public String getNationalid() {
        return nationalid;
    }
    public String getDrivinglicense() {
        return drivinglicense;
    }
    public String getDriverid() {
        return driverid;
    }
    public void Balance(float ridecost)
    {
        this.ridecost = ridecost;
    }
    public void FavoriteArea(String Area)
    {
        this.area = Area;
    }
    //public abstract void Register(String w, String x, String y, String z);

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public boolean endride(){

    }
    public Object listride(){

    }
}

