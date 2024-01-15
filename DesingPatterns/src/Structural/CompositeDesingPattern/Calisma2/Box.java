package CopositeDesingPattern.Calisma2;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

	private String name;
	private List<Component> componentList;
	
	
	
	public Box(String name) {
		
		this.name = name;
		componentList = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Component> getComponentList() {
		return componentList;
	}

	public void setComponentList(List<Component> componentList) {
		this.componentList = componentList;
	}
	  public void addComponent(Component component) {
	        componentList.add(component);
	    }

	@Override
	public void showPrice() {
		System.out.println(name + ":");
		for (Component component : componentList) {
			component.showPrice();
		}
		
	}

}
