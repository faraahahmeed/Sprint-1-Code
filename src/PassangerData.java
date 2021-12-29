
import java.util.ArrayList;
import java.util.List;

public class PassangerData  {

    private static PassangerData database ;
    public ArrayList <Passenger> passengerdb = new ArrayList<>();
    private PassangerData(){}

    public static PassangerData getinstance(){
        if(database==null){
            database=new PassangerData();
        }
        return database;
    }

    public void addPassenger(Passenger p){
        passengerdb.add(p);
    }

    public ArrayList <Passenger> getPassengers(){
        return passengerdb;
    }

    public void delete(Passenger p) {
        passengerdb.remove(p);
    }
}




