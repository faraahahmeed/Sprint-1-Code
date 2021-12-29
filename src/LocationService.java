public class LocationService {
        static int counter = 0;
        APIManager api;

        public int trackcalls(){
                counter ++;
                return counter;
        }
        public void Calculate(double mylat, double mylong, double destlat, double destlong){
                if (counter<5){
                        api = new GoogleMapsAPI();
                }
                else if(counter>5){
                        api = new Haversine();
                }
                api.CalculateETA(mylat, mylong, destlat, destlong);
        }
}
