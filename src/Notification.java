public class Notification {
    public void sendnotify(Ride ride) {
        for (int i = 0; i < Database.getinstance().getdrivers().size(); i++) {
            if (Database.getinstance().getdrivers().get(i).Area(ride.getSource())) {
                Database.getinstance().getdrivers().get(i).getArrayListofRides().add(ride);
            }
        }
    }

    public void sendoffer(Offer o) {
        o.getride().getpassenger().AcceptOffer().add(o);


    }
}