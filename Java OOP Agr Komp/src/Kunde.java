

public class Kunde {
	private Adresse anschrift;
	private String firma;
	private Auftrag[] aufträge=new Auftrag[30];
	private int countAufträge=0;
	
	public Kunde(String Firma){
	
		firma=Firma;
		  
		  }
		
	public void addAuftrag(Auftrag AUFTRAG) {
		 
		aufträge[countAufträge]=AUFTRAG;
		 System.out.println("Neuer Auftrag wurde erstellt bei index "+countAufträge);
		 countAufträge++;
	}
	public Auftrag getAuftrag(int COUNT) {
		return aufträge[COUNT];
	}
	public void setAuftrag(Auftrag AUFTRAG,int COUNT) {
		aufträge[COUNT]=AUFTRAG;
	}
	public void removeAuftragFromArray(int COUNT) {
		aufträge[COUNT]=null;
	}
	public void removeAuftrag(Auftrag AUFTRAG) {
		AUFTRAG=null;
	}
	public int ermittleAnzahlAufträge(){
		int anzahlAufträge=0;
		for(int i=0;i<aufträge.length;i++) {
			if(aufträge[i]!=null)
				anzahlAufträge++;
		}
		return anzahlAufträge;
	}
	
}
