public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float minTemp = 0.0f;
    private float maxTemp = 0.0f;
    private float avgTemp = 0.0f;
    private int numReadings = 0;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        //register THIS as a observer
        weatherData.registerObserver(this);
    }
    //pulls data when notified of a change
    public void update(){
        //pulls temp
        this.temperature = weatherData.getTemperature();
        numReadings++;
        //better AVG calculation
        avgTemp = ((avgTemp * (numReadings - 1))+ temperature) / numReadings;
        if(temperature<minTemp) minTemp=temperature;
        if(temperature>maxTemp) maxTemp = temperature;
        avgTemp = (avgTemp + temperature) / 2;
        display();
    }
    public void display(){
        System.out.println("Avg/Max/Min temperature = " + minTemp + "/" + maxTemp + "/" + avgTemp);
    }
}
