import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner input = new Scanner(System.in);

        Offer offer = new Offer();
        Ride ride= new Ride();
        Driver driver = new Driver();
        Passenger passenger = new Passenger();
        User user = new User();
        AdminUser adminUser = new AdminUser();


        while (true) {
            System.out.println("choice one of the following:  ");
            System.out.println("1)Driver\n 2) Passenger\n 3)Exit" );
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("1) Sign up " + "\n" + "2) Login");
                int ch = input.nextInt();
                switch (ch) {
                    case 1:
                        user.signup();
                        System.out.println("Enter National ID and License");
                        String licence = input.next();
                        String nationalId = input.next();
                        driver.setNationalid(nationalId);
                        driver.setDrivinglicense(licence);
                        System.out.println("wait till an admin verify Your Registeration");
                        adminUser.pending.add(driver);
                        adminUser.VerifyRegistrations(driver);
                        System.out.println("successfully verified " +
                                "you can log in now");
                        break;

                    case 2:
                        user.logIn();
                        System.out.println("1) Add Favourite area \n 2) Make Offer \n 3)end ride \n 4)exit  ");
                        int in = input.nextInt();
                        if (in == 1) {
                            String area = input.next();
                            driver.addfavarea(area);
                            Database.getinstance().adddriver(driver);
                        } else if (in == 2) {
                            float cost = input.nextInt();
                            driver.makeoffer(cost);
                        } else if (in == 3) {
                            driver.endride(); //////////
                        } else if (in == 4) {
                            driver.listride();
                        } else if (in == 5) {
                            break;
                        } else {
                            System.out.println("invalid input");
                        }
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }
            }

            if (choice == 2) {
                System.out.println("1) Sign in \n 2) Login");
                int pch = input.nextInt();
                switch (pch) {
                    case 1:
                        passenger.signup();
                        break;

                    case 2:
                        passenger.logIn();
                        System.out.println("1) Request Ride \n 2)rate ride \n 3)check driver details \n 4)exit ");
                        int inp = input.nextInt();
                        if (inp == 1) {
                            System.out.println("enter your source and destination");
                            String source=input.nextLine();
                            String destination=input.nextLine();
                            passenger.RequestRide(source,destination);
                            System.out.println(driver.getArrayListofRides());
                        } else if (inp == 2) {
                            float rate= input.nextFloat();
                            ride.RateRide(rate);
                            break;
                        } else if (inp == 3) {

                            System.out.println(passenger.DriverDetails(driver));
                            break;
                        }
                        else if (inp == 4) {
                            break;
                        }
                        else System.out.println("invalid input");
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }

                if (choice == 3) {
                    System.exit(0);
                }
            }
        }
    }
}

