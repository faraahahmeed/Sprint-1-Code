public class Offer
{
    private float price;
    private Ride r = new Ride();
    User user = new User();
    public void AddOffer(float price ) {
        //this.r = r;
        //driver.setPrice(price);
        this.price= price;
        user.getId();
    }

    public  Ride getride() {
        return r;
    }

    public float getPrice() {
        return price;
    }

}