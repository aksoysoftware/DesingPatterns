package Structural.Facade;

import Structural.Facade.EncryptorFacade.EncType;

public class CustomEncryptor {

	public static void main(String[] args) {
		EncryptorFacade encryptorFacade = new EncryptorFacade();
		encryptorFacade.encrypt("Test", EncType.AES);
		
	}
}
