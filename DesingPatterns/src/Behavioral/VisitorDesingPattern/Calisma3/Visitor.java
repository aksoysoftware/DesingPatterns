package VisitorDesingPattern.Calisma3;

public interface  Visitor {
	
	public void visitVadeli(VadeliHesap vadeliHesap);
	public void visitVadesiz(VadesizHesap vadesizHesap);
	public void visitKrediKarti(KrediKartı krediKartı);
	

}
 class FaizVisitor  implements Visitor{

		
		@Override
		public void visitVadesiz(VadesizHesap vadesizHesap) {
			System.out.println("Vadesiz Hesabın faizi yoktur..");
			
		}
		
		
		@Override
		public void visitVadeli(VadeliHesap vadeliHesap) {
			  double faiz = vadeliHesap.getBakiye() * vadeliHesap.getFaizOrani();
		        System.out.println("Vadeli hesabın faizi: " + faiz + " TL");
			
		}

		

		@Override
		public void visitKrediKarti(KrediKartı krediKartı) {
			 double faiz = krediKartı.getBorc() * krediKartı.getFaizOrani();
		        System.out.println("Kredi kartının faizi: " + faiz + " TL");
			
		}
		class LimitVisitor implements Visitor {
		   

			@Override
			public void visitVadeli(VadeliHesap vadeliHesap) {
				 System.out.println("Vadeli hesabın limiti: " + vadeliHesap.getBakiye() + " TL");
				
			}

			@Override
			public void visitVadesiz(VadesizHesap vadesizHesap) {
				 System.out.println("Vadesiz hesabın limiti: " + vadesizHesap.getBakiye() + " TL");
				
			}

			@Override
			public void visitKrediKarti(KrediKartı krediKartı) {
				// TODO Auto-generated method stub
		        System.out.println("Kredi kartının limiti: " + krediKartı.getLimit() + " TL");

				
			}
		}	
		
		class BakiyeVisitor implements Visitor{

			@Override
			public void visitVadeli(VadeliHesap vadeliHesap) {
				 System.out.println("Vadeli hesabın bakiyesi: " + vadeliHesap.getBakiye() + " TL");				
			}

			@Override
			public void visitVadesiz(VadesizHesap vadesizHesap) {
				System.out.println("Vadesiz hesabın bakiyesi: " + vadesizHesap.getBakiye() + " TL");				
			}

			@Override
			public void visitKrediKarti(KrediKartı krediKartı) {
				System.out.println("Kredi kartının bakiyesi: " + (krediKartı.getLimit() - krediKartı.getBorc()) + " TL");				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}