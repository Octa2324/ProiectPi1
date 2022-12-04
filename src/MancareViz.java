import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;

public class MancareViz extends JLabel implements ListCellRenderer{
	
	List<Mancare> l = new ArrayList<Mancare>();

	MancareViz(){
		setOpaque(true);
	}
	
	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		Mancare item = (Mancare) value;
		this.setText(item.getNume());
		this.setIcon(item.getIcon());
		
		//de facut mai departe
		if(isSelected) {
			setBackground(Color.BLACK);
			setForeground(Color.WHITE);
			
		}
		
		if (!isSelected)
		{
			setBackground(Color.WHITE);
			setForeground(Color.BLACK);
		}
		
		if (cellHasFocus)
		{
			setBorder(BorderFactory.createLineBorder(Color.RED));
			//poate nu merge
			 JOptionPane.showMessageDialog(this, "Mancare adaugata!");
			 
			
		}
		
		else
		{
			setBorder(BorderFactory.createEmptyBorder());
		}
		return this;
		
	}
	
	public List getListComanda() {
		return this.l;
	}
	

}
