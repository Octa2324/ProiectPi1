import javax.swing.ImageIcon;

public class Mancare {
	
	private String nume;
	private int calorii;
	private int proteine;
	private int carbohidrati;
	private int grasimi;
	private double pret;
	private ImageIcon icon;
	
	
	public Mancare (String nume, ImageIcon imageIcon) {
		super();
		this.nume = nume;
		this.icon = imageIcon; 
		
	}

	
	Mancare(String nume, int calorii, int proteine, int carbohidrati, int grasimi, double pret){
		this.nume = nume;
		this.calorii = calorii;
		this.proteine = proteine;
		this.carbohidrati = carbohidrati;
		this.grasimi = grasimi;
		this.pret = pret;
	}
	

	public String toString() {
		return "Mancare: " + nume + " calorii: " + calorii + " proteine: " + proteine + " carbohidrati: " + carbohidrati + " grasimi: " + grasimi ;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public int getCalorii() {
		return this.calorii;
	}
	
	public int getProteine() {
		return this.proteine;
	}
	
	public int getCarbohidrati() {
		return this.carbohidrati;
	}
	
	public int getGrasimi() {
		return this.grasimi;
	}
	
	public ImageIcon getIcon() {
		return this.icon;
	}
	
	public void setNume(String newNume) {
		this.nume = newNume;
	}
	
	public void setCalorii(int newCalorii) {
		this.calorii = newCalorii;
	}
	
	public void setProteine(int newProteine) {
		this.proteine = newProteine;
	}
	
	public void setCarbohidrati(int newCarbohidrati) {
		this.carbohidrati = newCarbohidrati;
	}
	
	public void setGrasimi(int newGrasimi) {
		this.grasimi = newGrasimi;
	}

}
