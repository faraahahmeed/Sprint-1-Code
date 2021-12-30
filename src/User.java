import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;
public class User
{
    private String username;
    private String email;
    private String password;
    private String mobilenum;
    private String ID;
    Scanner input = new Scanner(System.in);

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


    public void ViewHistory(){
        Ride ride = new Ride();
       System.out.println(ride.getRideHistory(ride));
    }
     public void signup() {
         System.out.println("Enter Username, Email ,Password and Mobile Number");
         String username = input.next();
         String password = input.next();
         String email = input.next();
         String mobilenum = input.next();


     }

    public  void logIn(Driver driver){
        System.out.println("Enter Username");
        username=input.nextLine();
        System.out.println("Enter password");
        password =input.next();
        driver.checkloginFordriver();
    }
    public  void logIn(Passenger passenger){
        System.out.println("Enter Username");
        username=input.nextLine();
        System.out.println("Enter password");
        password =input.next();
        passenger.checkloginForpassenger();
    }

}
