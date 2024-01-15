package AdapterDesingPattern.Calisma1;

public class Mp4Player implements AdvanceMediaPlayer{

	

	@Override
	public void playVlc(String fileName) {
		// do noting
		
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("playing m4 fil Name:" + fileName);
	}

}
