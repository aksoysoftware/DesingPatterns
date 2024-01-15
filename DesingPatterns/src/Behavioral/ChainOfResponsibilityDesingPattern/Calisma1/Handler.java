package ChainOfResponsibilityDesingPattern.Calisma1;

public abstract class Handler {
	
	 // Zincirdeki bir sonraki işleyiciyi tutmak için bir alan tanımlanır
    protected Handler next;
    

    // Zincirdeki bir sonraki işleyiciyi ayarlamak için bir metod tanımlanır
    public void setNext(Handler next) {
        this.next = next;
    }

    
    
    public Handler getNext() {
		return next;
	}




	// İstekleri işlemek için soyut bir metod tanımlanır
    public abstract String handle(Request request);
	

}
