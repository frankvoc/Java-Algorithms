public class ForecastDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        //register this observer
        weatherData.registerObserver(this);
    }
    //pulling when notified
    public void update(){
        //pulls each
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public void display(){
        System.out.println("Forecast: More of the same");
    }
}
