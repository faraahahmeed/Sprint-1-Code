import java.util.ArrayList;
public class Database {
    private static Database database ;
    public ArrayList <Passenger> passengerdb;
    public ArrayList <Driver> driverdb=new ArrayList<>();
    public void adddriver(Driver d){driverdb.add(d);}
    public ArrayList <Driver> getdrivers(){return driverdb;}
    private Database(){}
    public static Database getinstance(){
        if(database==null){
            database=new Database();
        }
        return database;
    }

}