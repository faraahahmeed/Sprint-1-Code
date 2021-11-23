import java.util.UUID;

public class User
{
    private String username;
    private String email;
    private String password;
    private String mobilenum;
    private String ID;


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
        return ID;
    }

    public  void Register(String w, String x , String y, String z)
    {
        username = w;
        email = x;
        password = y;
        mobilenum = z;
        ID = UUID.randomUUID().toString();
    }

    public void ViewHistory(){
        Ride ride = new Ride();
        System.out.println(ride.getHistory());
    }

}
