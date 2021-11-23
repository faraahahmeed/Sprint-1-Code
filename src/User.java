import java.util.UUID;

public abstract class User  //extends Observer
{
    private String username;
    private String email;
    private String password;
    private String mobilenum;
    private String id;


    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getMobilenum() {
        return mobilenum;
    }

    public String getId() {
        return id;
    }

    public  void Register(String w, String x , String y, String z)
    {
        username = w;
        email = x;
        password = y;
        mobilenum = z;
    }
    String ID = UUID.randomUUID().toString();
    public void ViewHistory(String id){
        ///////////////////////////
    }

}
