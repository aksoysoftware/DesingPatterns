package ObserverDesingPattern.Calisma3;

public class Main {
	public static void main(String[] args) {
		YoutubeChannel youtubeChannel = new YoutubeChannel("Yazilim Tasarimi Ve Mimarisi");
		
		Subscriber subscriber = new Subscriber("Muhammed");
		Subscriber subscriber1 = new Subscriber("Ali");
		Subscriber subscriber2= new Subscriber("Kemal");
		Subscriber subscriber3 = new Subscriber("Hakan");
		Subscriber subscriber4 = new Subscriber("Mete");
		Subscriber subscriber5 = new Subscriber("Mert");
		Subscriber subscriber6 = new Subscriber("Fatma");
		Subscriber subscriber7 = new Subscriber("Dilan");
		
		
		youtubeChannel.attach(subscriber);
		youtubeChannel.attach(subscriber2);
		youtubeChannel.attach(subscriber3);
		youtubeChannel.attach(subscriber4);
		youtubeChannel.attach(subscriber5);
		youtubeChannel.attach(subscriber1);
		youtubeChannel.attach(subscriber6);
		youtubeChannel.attach(subscriber7);
		
		youtubeChannel.uploadVideo(	youtubeChannel.getChannelName() +" Kanali yeni video paylasti :"+ "Observer Desing Pattern in Java");
	
		
		youtubeChannel.detach(subscriber7);
		youtubeChannel.detach(subscriber6);
		youtubeChannel.detach(subscriber5);
		
		youtubeChannel.uploadVideo(	youtubeChannel.getChannelName() +" Kanali yeni video paylasti :"+ "Facade Desing Pattern in Java");
		
		
		
		
	}

}
