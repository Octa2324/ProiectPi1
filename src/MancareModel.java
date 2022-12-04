import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class MancareModel  extends DefaultListModel{
	
	MancareModel(){
		
		Mancare pui = new Mancare("Piept de pui",new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\pui.jpg"));
		Mancare vita = new Mancare("Pulpa de vita",new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\vita.jpg"));
		Mancare peste = new Mancare("File de somon",new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\somon.jpg"));
		Mancare curcan = new Mancare("Piept de curcan",new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\curcan.jpg"));
		Mancare ciorba = new Mancare("Ciorba radauteana",new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\ciorbarada.jpg"));
		Mancare fasole = new Mancare("Fasole cu ciolan",new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\fasole.jpg"));
		Mancare sarmale = new Mancare("Sarmale",new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\sarmale.jpg"));
		Mancare salata = new Mancare("Salata cezar",new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\salata.jpg"));
		Mancare shaorma = new Mancare("Shaorma de pui",new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\shaorma.jpg"));
		
		addElement(pui);
		addElement(vita);
		addElement(peste);
		addElement(curcan);
		addElement(ciorba);
		addElement(fasole);
		addElement(sarmale);
		addElement(salata);
		addElement(shaorma);
	}
	
	
}
