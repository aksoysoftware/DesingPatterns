package AdapterDesingPattern.Calisma1;

public class VlcPlayer implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("playing vlc file . Name:" + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
		
	}

	

}
