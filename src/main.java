import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //User user = new User();
        Driver driver = new Driver();
        Passenger passenger = new Passenger();
        System.out.println("enter username,password,email & mobilenumber");

        String username =input.next();
        String password = input.next();
        String email = input.next();
        String mobilenum = input.next();

        System.out.println("Passenger(p) or Driver (d)");
        String option = input.next();

        if (option.equalsIgnoreCase("d") ){

            System.out.println("Enter national id and Driving license");
            String id = input.next();
            String license = input.next();
            driver.Register(username, password, email, mobilenum);
            driver.setNationalid(id);
            driver.setDrivinglicense(license);

            
        }
        else if(option.equalsIgnoreCase("p")){

            passenger.Register(username, password, email, mobilenum);

        }
        else{
            System.out.println("Enter valid option...");
        }

    }
}
