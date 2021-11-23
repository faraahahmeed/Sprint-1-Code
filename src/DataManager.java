
public class DataManager {
	private Operations op;
    public void setDataType(Operations op){
        this.op = op;
    }
    public void executeSave(String data){
        op.save(data);
    }
    public String executeGet(String ID){
        return op.get(ID);
    }
    public void executeUpdate(String OLDdata, String NEWdata){
        op.update(OLDdata, NEWdata);
    }
    public void executeDelete(String ID){
        op.delete(ID);
    }
}
