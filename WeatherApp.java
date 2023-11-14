import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherApp {

    private static final String API_KEY = "7d93588c294c8941050fceecc095ef60";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=";

    public static void main(String[] args) {
        try {
            
            String city = "London";
            String apiUrl = API_URL + city + "&appid=" + API_KEY;

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            String weatherData = response.toString();
            System.out.println("Weather Data: " + weatherData);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Occurred: " + e.getMessage());
        }
        
    }
}
