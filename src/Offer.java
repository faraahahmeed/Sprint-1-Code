import java.util.ArrayList;
import java.util.List;

public class Offer
{
    private float price;
    private Ride r = new Ride();
    User user = new User();
    List<Offer> offers = new ArrayList<>();

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
    public void addOffer(Offer o){
        offers.add(o);
    }
    public void getOffer(){
        int index = 1;
        for (Offer i: offers){
            System.out.print(index);
            System.out.println(i);
            index ++;
        }
    }
}