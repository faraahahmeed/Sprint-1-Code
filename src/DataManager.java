import java.util.ArrayList;
import java.util.List;

public class DataManager {
	private Operations op;

    public void setDataType(Operations op){
        this.op = op;
    }
    public void executeSave(User u){
        op.save(u);
    }
    public ArrayList<User> executeGet(){
        return op.getList();
    }
    public void executeDelete(User u){
        op.delete(u);
    }
}
