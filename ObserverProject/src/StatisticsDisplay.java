public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;
    public StatisticsDisplay (WeatherData weatherData){
        this.weatherData = weatherData;
        //register this 
        weatherData.registerObserver(this);
    }
    //pull approach
    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
    public void display(){
        System.out.println("Current Conditions: " + temperature + "F degrees and" + humidity + "% humindity");
    }
}
