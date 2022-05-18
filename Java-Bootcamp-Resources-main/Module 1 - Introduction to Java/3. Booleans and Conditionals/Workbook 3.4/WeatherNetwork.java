public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = 0;

        String forecast = "";

        if (temp >= -15 && temp <= -1) {
            forecast = "The forecast is FREEZING! Stay home!";
        } else if (temp >= 0 && temp <=10) {
            forecast = "is Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. go outside!";
        }
        System.out.println(forecast);
    }
}
