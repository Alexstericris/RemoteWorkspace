

public class Kunde {
	private Adresse anschrift;
	private String firma;
	private Auftrag[] auftr�ge=new Auftrag[30];
	private int countAuftr�ge=0;
	
	public Kunde(String Firma){
	
		firma=Firma;
		  
		  }
		
	public void addAuftrag(Auftrag AUFTRAG) {
		 
		auftr�ge[countAuftr�ge]=AUFTRAG;
		 System.out.println("Neuer Auftrag wurde erstellt bei index "+countAuftr�ge);
		 countAuftr�ge++;
	}
	public Auftrag getAuftrag(int COUNT) {
		return auftr�ge[COUNT];
	}
	public void setAuftrag(Auftrag AUFTRAG,int COUNT) {
		auftr�ge[COUNT]=AUFTRAG;
	}
	public void removeAuftragFromArray(int COUNT) {
		auftr�ge[COUNT]=null;
	}
	public void removeAuftrag(Auftrag AUFTRAG) {
		AUFTRAG=null;
	}
	public int ermittleAnzahlAuftr�ge(){
		int anzahlAuftr�ge=0;
		for(int i=0;i<auftr�ge.length;i++) {
			if(auftr�ge[i]!=null)
				anzahlAuftr�ge++;
		}
		return anzahlAuftr�ge;
	}
	
}
