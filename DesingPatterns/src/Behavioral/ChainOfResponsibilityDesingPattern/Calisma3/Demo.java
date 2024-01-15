package ChainOfResponsibilityDesingPattern.Calisma3;

import java.util.ArrayList;
import java.util.List;

interface Observer{
public void update(float temp);
}


interface Subject{
void addObserver(Observer obj);
void removeObserver(Observer obj);
void notifyObservers();
}


 class WeatherData implements Subject{
private List<Observer> observers;
private float temp;


public WeatherData(){
	observers=new ArrayList<>();
}


@Override
public void addObserver(Observer observer) {
    observers.add(observer);
}


@Override
public void removeObserver(Observer observer) {
    observers.remove(observer);
}


@Override
public void notifyObservers() {
    for (Observer observer : observers) {
        observer.update(temp);
    }
}


public void setMeasurements(float temperature) {
    this.temp = temperature;
    notifyObservers();
}
}


 class Display implements Observer {
private float temperature;


@Override
public void update(float temperature) {
    this.temperature = temperature;
    display();
}


private void display() {
    System.out.println("Current conditions: " + temperature);
}
}


public class Demo{
	public static void main(String[] args)
{
	Display display1 = new Display();
    Display display2 = new Display();

    WeatherData weatherData=new WeatherData();

    weatherData.addObserver(display1);
    weatherData.addObserver(display2);


    weatherData.setMeasurements(65);
    weatherData.setMeasurements(56);


    weatherData.removeObserver(display2);


    weatherData.setMeasurements(36);
}
}
