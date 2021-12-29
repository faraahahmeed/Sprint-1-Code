import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GoogleMapsAPI implements APIManager{

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://google-maps-geocoding.p.rapidapi.com/geocode/json?latlng=40.714224%2C-73.96145&language=en"))
            .header("x-rapidapi-host", "google-maps-geocoding.p.rapidapi.com")
            .header("x-rapidapi-key", "AIzaSyCQOq5HPOwbYtuBcLB_WKMLSH_3sqOUDg8")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();

    HttpResponse<String> response;

    {
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //System.out.println(response.body());


    @Override
    public void CalculateETA(double mylat, double mylong, double destlat, double destlong) {

    }
}
