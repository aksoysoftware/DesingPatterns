package FactoryDesingPattern;

public abstract class Para {
	
	private int m_NominalDeger;
	
	
	protected Para(int nominalDeger) {
		m_NominalDeger=nominalDeger;
		
	}


	public String getM_NominalDeger() {
		return Integer.toString(m_NominalDeger)+" TL";
	}


	
	
}
