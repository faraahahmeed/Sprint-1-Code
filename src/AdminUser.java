import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class AdminUser {
    private Driver driver;

    boolean output ;
    ArrayList<Driver> pending=new ArrayList<>();
    public boolean VerifyRegistrations(Driver driver) {
        for (int i = 0; i < driver.pending.size(); i++) {
            if (driver.pending.get(i).getDrivinglicense() == null
                    || driver.getNationalid().length() < 14)
            {output=false;
            System.out.println("Your account is Verfied and you can logIn now!...");}
            else
                output=true;

        }
        return output;
    }
    /*public void ListRegistrations(Driver driver)
        {
            return driver;
        }*/
 }
