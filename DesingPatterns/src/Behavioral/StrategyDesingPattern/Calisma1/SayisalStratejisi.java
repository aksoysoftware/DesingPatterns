package StrategyDesingPattern.Calisma1;

public class SayisalStratejisi implements SinavStratejisi {

	@Override
	public EnumDers getBirinci() {
		// TODO Auto-generated method stub
		return EnumDers.MATEMATIK;
	}

	@Override
	public EnumDers getIkıncı() {
		// TODO Auto-generated method stub
		return EnumDers.FEN;
	}

	@Override
	public EnumDers getUcuncu() {
		// TODO Auto-generated method stub
		return EnumDers.TURKCE;
	}

	@Override
	public EnumDers getDorduncu() {
		// TODO Auto-generated method stub
		return EnumDers.SOSYAL;
	}
	
}
