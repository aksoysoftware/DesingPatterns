package ObserverDesingPattern.Calisma3;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

	private String channelName;
	private String latestVideo;
	private List<Observer>observers;
	
	
	
	
	
	public YoutubeChannel(String channelName) {
		this.channelName=channelName;
		this.observers = new ArrayList<>();
	}

	 public void uploadVideo(String videoTitle) {
	        this.latestVideo = videoTitle;
	        notifyObservers("New video: " + videoTitle);
	}
	
	 
	 
	 
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getLatestVideo() {
		return latestVideo;
	}

	public void setLatestVideo(String latestVideo) {
		this.latestVideo = latestVideo;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}


	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);	
	}

	@Override
	public void notifyObservers(String message) {
		
		for (Observer observer : observers) {
			observer.update(message);
		}
		
	}

}
