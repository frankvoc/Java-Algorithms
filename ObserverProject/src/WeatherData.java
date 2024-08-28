import java.util.ArrayList;
public class WeatherData implements Subject{
    //our list of observers
    private ArrayList<Observer> observers;
    private float temperature = 0.0f;
    private float humidity = 0.0f;
    private float pressure = 0.0f;

    public WeatherData(){
        observers = new ArrayList();
    }
    public void registerObserver(Observer o){
        //adding new observer
        observers.add(o);
    }
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >= 0){
            //removing an observer
            observers.remove(i);
        }
    }
    //notify observer without pushing the data like before
    public void notifyObservers(){
        for(Observer observer : observers){
            //calls update for each observer without passing data
            observer.update();
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    //getter methods for Observers to pull data
    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
}
