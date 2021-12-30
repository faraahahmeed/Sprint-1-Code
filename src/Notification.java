public class Notification {
    public void sendnotify(Ride ride){
        for(int i=0; i < DriverData.getinstance().getdrivers().size();i++){
            if(DriverData.getinstance().getdrivers().get(i).Area(ride.getSource())){
                DriverData.getinstance().getdrivers().get(i).getArrayListofRides().add(ride);
            }
        }
    }
    public void sendoffer(Offer o) {
        o.getride().getpassenger().AcceptOffer().add(o);


    }
    public void sendnotifywhenuseracceptoffer(Ride ride)
    {
        if(ride.RideStatus()==true) {DriverData.getinstance().getdrivers();}
    }
    }
