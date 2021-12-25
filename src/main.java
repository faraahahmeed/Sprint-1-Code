import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random rd = new Random();
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("enter username,password,email & mobilenumber");

        String username =input.next();
        String password = input.next();
        String email = input.next();
        String mobilenum = input.next();

        Offer offer = new Offer();
        Ride ride = new Ride();
        Driver driver = new Driver();
        //NotifyManager notifyManager=new NotifyManager();
        Passenger passenger = new Passenger();


        System.out.println("Passenger(p) or Driver (d)");
        String option = input.next();

        if (option.equalsIgnoreCase("d") ){

            System.out.println("Enter national id and Driving license");
            String id = input.nextLine();
            String license = input.nextLine();
            driver.Register(username, password, email, mobilenum);
            driver.setNationalid(id);
            driver.setDrivinglicense(license);

            while(flag) {
                System.out.println("choose");
                System.out.println(" 1- Add area.\n 2- End Ride.\n 3- View ride history.\n 4- Add offer.\n 5- Exit");
                int choice = input.nextInt();
                switch (choice){
                    case 1: {
                        System.out.println("Enter area");
                        String area = input.next();
                        driver.addfavarea(area);
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
                        price = input.nextFloat();
                        offer.AddOffer(ride,price);
                        //notifyManager.Notify();
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

            while (flag){

                float cost =rd.nextFloat();
                passenger.Register(username, password, email, mobilenum);
                System.out.println("if you want to request ride, type your source area snd Destination");
                String source =input.nextLine();
                String destination =input.nextLine();
                ride.requestRide(source,destination);
                //driver.makeoffer(ride,cost);


                System.out.println(offer.getPrice());

                System.out.println("want to accept offer?");
                String accept=input.nextLine();
                if ( accept == "yes") {
                    passenger.AcceptOffer(); break;
                }
                /*else {
                    driver.setPrice(cost);
                    System.out.println(driver.getPrice());
                }*/
                System.out.println("do you want to view driver details?");
                String choice=input.nextLine();
                if(choice=="yes")
                {
                    passenger.DriverDetails(driver);
                }

                System.out.println("rate ride");
                float rate=input.nextFloat();
                passenger.Rating(rate);

            } }
        else{
            System.out.println("valid option...");
        }

    }
}
