package FacadeDesingPattern;

public class VideoFile {
	
	private String name;
	private String codecType;
	
	
	public VideoFile(String name, String codecType) {
		super();
		this.name = name;
	    this.codecType = name.substring(name.indexOf(".") + 1);
	}
	
	public String getCodecType() {
		return codecType;
	}
	public String getName() {
		return name;
	}
	public void setCodecType(String codecType) {
		this.codecType = codecType;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
