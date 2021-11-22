
public class DataManager {
	private Operations op;
    public void setDataType(Operations op){
        this.op = op;
    }
    public void executeSave(Object data){
        op.save(data);
    }
    public Object executeGet(String ID){
        return op.get(ID);
    }
    public void executeUpdate(Object OLDdata, Object NEWdata){
        op.update(OLDdata, NEWdata);
    }
    public void executeDelete(String ID){
        op.delete(ID);
    }
    /*public static void main(String[] args){
        System.out.println("hello world");
    }*/
}
