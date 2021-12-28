import java.util.ArrayList;
import java.util.List;

public class DriverData {
    private static DriverData database ;
    public ArrayList <Driver> driverdb=new ArrayList<>();
    public void adddriver(Driver d){driverdb.add(d);}
    public ArrayList <Driver> getdrivers(){return driverdb;}
    private DriverData(){}
    public static DriverData getinstance(){
        if(database==null){
            database=new DriverData();
        }
        return database;
    }

    public void delete(Driver d) {
        driverdb.remove(d);
    }

}