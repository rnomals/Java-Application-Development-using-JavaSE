public class TemperatureConverter {
    public static void main(String[] args){
        float temperatureCelcius = 37;
        float temperatureKelvin = temperatureCelcius + 273.15f;
        float temperatureFaranheit = (temperatureCelcius * 9/5) + 32;

        System.out.println("Temperature in Celcius: "+temperatureCelcius);
        System.out.println("Temperature in Farenheit:"+temperatureFaranheit);
        System.out.println("Tempearature in Kelvin: "+temperatureKelvin);
    }
}
