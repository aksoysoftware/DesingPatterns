package ObserverDesingPattern.Calisma2;

import java.util.ArrayList;

public abstract class Subject {

	 private ArrayList<Observer> observers = new ArrayList<>();
	 
	 public void addObserver(Observer observer) {
		 observers.add(observer);
	 }
	 public void removeObserver(Observer observer) {
		 observers.remove(observer);
	 }
	 
	 public void notifyObservers(Product product) {
	        for (Observer observer : observers) {
	            observer.notifyPriceChange(product);
	        }
	 }
	
	 
}
