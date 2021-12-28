
import java.util.ArrayList;
import java.util.List;

public class PassangerData implements Operations {

    private static PassangerData database ;
    public ArrayList <User> passengerdb = new ArrayList<>();
    private PassangerData(){}

    public static PassangerData getinstance(){
        if(database==null){
            database=new PassangerData();
        }
        return database;
    }

    @Override
    public void save(User u) {
        passengerdb.add(u);
    }

    @Override
    public ArrayList<User> getList() {
        return passengerdb;
    }

    @Override
    public void delete(User u) {
        passengerdb.remove(u);
    }
}
