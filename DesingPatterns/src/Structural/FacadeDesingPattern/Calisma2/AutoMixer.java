package FacadeDesingPattern;

import java.io.File;

public class AutoMixer {
	public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }

}
