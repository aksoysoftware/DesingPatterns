package ObserverDesingPattern.Calisma3;

public class Subscriber  implements Observer{

	private String name;
	
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void update(String message) {
		System.out.println(name + "subs: " +message);
		
	}

}
