package Structural.Facade;

public class EncryptorFacade {

	private AESEncryptor aesEncryptor = new AESEncryptor();
	private MD5Encryptor md5Encryptor = new MD5Encryptor();
	private SHAEncryptor shaEncryptor = new SHAEncryptor();
	
	
	
	public void encrypt(String text,EncType encType) {
		switch (encType) {
		case AES:
			aesEncryptor.encrypt(text);
			break;
		case SHA:
			shaEncryptor.encryptor(text, "KEY", true);
			break;
		case MD5:
			md5Encryptor.encryptor(text, "KEY");
			break;
			default: throw new IllegalArgumentException(encType.toString());
		}		
	}
	
	public enum EncType{
		SHA,
		MD5,
		AES
	}
	
}
