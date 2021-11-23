import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        //User user = new User();
        Driver driver = new Driver();
        Passenger passenger = new Passenger();
        Ride ride = new Ride();
        Offer offer = new Offer();

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

            boolean flag = true;
          while(flag) {
               System.out.println(" 1- Add area.\n 2- End Ride.\n 3- View ride history.\n 4- Add offer.\n 5- Exit");
                int choice = in.nextInt();
                switch (choice){
                    case 1: {
                        System.out.println("Enter area");
                        String area = input.next();
                        driver.FavoriteArea(area);
                        break;
                    }
                    case 2: {
                        driver.endride();
                        ride.RideStatus();
                        break;
                    }
                    case 3:{
                        driver.listride();
                        break;
                    }
                    case 4:{
                        System.out.println("Enter price");
                        float price;
                        price = in.nextFloat();
                        offer.AddOffer(price);
                        break;
                    }
                    case 5:{
                        flag = false;
                        break;
                    }
                    default:{
                        System.out.println("Enter valid choice");
                        break;
                    }
                }
            }
        }
        else if(option.equalsIgnoreCase("p")){

            passenger.Register(username, password, email, mobilenum);

        }
        else{
            System.out.println("Enter valid option...");
        }

    }
}
