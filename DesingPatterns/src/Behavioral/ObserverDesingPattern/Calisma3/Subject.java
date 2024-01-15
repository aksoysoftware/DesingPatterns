package ObserverDesingPattern.Calisma3;

public interface Subject {
	
	void attach(Observer observer);//eklemek	
    void detach(Observer observer);//çıkarmak
    void notifyObservers(String message);//tasarım deseninin amacı olan fonksiyon
	
	
}
