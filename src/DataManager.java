import java.util.List;

public class DataManager {
	private Operations op;
    public void setDataType(Operations op){
        this.op = op;
    }
    public void executeSave(String area){
        op.save(area);
    }
    public List<String> executeGet(){
        return op.getList();
    }
    public void executeDelete(String ID){
        op.delete(ID);
    }
}
