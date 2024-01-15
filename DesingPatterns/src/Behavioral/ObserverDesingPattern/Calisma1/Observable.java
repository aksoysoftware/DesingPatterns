package ObserverDesingPattern.Calisma1;

import java.util.ArrayList;
import java.util.List;

public  abstract class Observable {

	private List<Observer> observers ;

	public Observable() {
		this.observers = new ArrayList<>(); 
	}
	
	public void ekle(Observer observer) {
		observers.add(observer);
	}
	public void cikar(Observer observer) {
		observers.remove(observer);
	}
	public void haberVer() {
		for (Observer observer : observers) {
				observer.update(this);
		}
	}
	
	
}
