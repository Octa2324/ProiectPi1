import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculatorCalorii extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	Container container = getContentPane();
	JLabel logo = new JLabel();
	JLabel alege = new JLabel("Alege mancare");
	JButton backButton = new JButton("Inapoi");
	JButton mancare1 = new JButton("Pui");
	JButton mancare2 = new JButton("Vita");
	JButton mancare3 = new JButton("Peste");
	JButton mancare4 = new JButton("Curcan");
	JLabel m1 = new JLabel();
	JLabel m2 = new JLabel();
	JLabel m3 = new JLabel();
	JLabel m4 = new JLabel();
	
	JLabel adLabel = new JLabel("Adauga cantitate");
	JButton ok = new JButton("Calculeaza");
	JTextField foodTextField = new JTextField();
	
	JCheckBox showPassword1 = new JCheckBox();
	JCheckBox showPassword2 = new JCheckBox();
	JCheckBox showPassword3 = new JCheckBox();
	JCheckBox showPassword4 = new JCheckBox();
	
	
	
	
	CalculatorCalorii(){
	
		
		 m1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\pui.jpg"));
		 m2.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\vita.jpg"));
		 m3.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\somon.jpg"));
		 m4.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\curcan.jpg"));
		
		 logo.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Grab a bite.png"));
		 Dimension size = logo.getPreferredSize();
		 logo.setBounds(180, 0, 680, 271);
		 
		 backButton.setBounds(930,600,120,40);
		 mancare1.setBounds(100,300,150,50);
		 showPassword1.setBounds(100,300,50,30);
		 showPassword2.setBounds(100,400,50,50);
		 showPassword3.setBounds(100,500,50,50);
		 showPassword4.setBounds(100,600,50,50);
		 Color color=new Color(25, 195 ,247);
	     showPassword1.setBackground(color);
	     showPassword1.setOpaque(true);
	     showPassword2.setBackground(color);
	     showPassword2.setOpaque(true);
	     showPassword3.setBackground(color);
	     showPassword3.setOpaque(true);
	     showPassword4.setBackground(color);
	     showPassword4.setOpaque(true);
		 
		 m1.setBounds(150,300,150,50);
		 m2.setBounds(150,400,150,50);
		 m3.setBounds(150,500,150,50);
		 m4.setBounds(150,600,150,50);
		 
		 adLabel.setBounds(550, 400, 100, 30);
		 foodTextField.setBounds(650, 400, 150, 30);
		 ok.setBounds(660,470,100,30);
		 
		 alege.setBounds(120,250,130,30);
		 
		 
		 
		 container.setLayout(null);
		 
		 frame.add(logo);
		 frame.add(backButton);
		 frame.add(showPassword1);
		 frame.add(showPassword2);
		 frame.add(showPassword3);
		 frame.add(showPassword4);
		 frame.add(alege);
		 frame.add(m1);
		 frame.add(m2);
		 frame.add(m3);
		 frame.add(m4);
		 frame.add(adLabel);
		 frame.add(foodTextField);
		 frame.add(ok);
		 
		 backButton.addActionListener(this);
		 showPassword1.addActionListener(this);
		 showPassword2.addActionListener(this);
		 showPassword3.addActionListener(this);
		 showPassword4.addActionListener(this);
		 ok.addActionListener(this);
		
		
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setBounds(10, 10, 1080, 720);
		  frame.setLayout(null);
		  frame.setVisible(true);
		  frame.setResizable(false);
		  
		  frame.getContentPane().setBackground(color);
		  frame.setTitle("Grab a bite");
	}
	 
	 
	 
	 
	 
	 
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Mancare pui = new Mancare("Pui",300,25,12,10,15);
		Mancare vita = new Mancare("Vita",350,26,8,15,20);
		Mancare peste = new Mancare("Peste",400,22,1,40,21);
		Mancare curcan = new Mancare("Curcan",360,24,11,9,16);
		
		Mancare x = new Mancare("X",0,0,0,0,0);
		String y;
		
		
		
		if(e.getSource() == backButton) {
			frame.setVisible(false);
			AlegeOptiuni mama = new AlegeOptiuni();
		}
	
		if(showPassword1.isSelected()) {
			
			x.setNume(pui.getNume());
			x.setCalorii(pui.getCalorii());
			x.setProteine(pui.getProteine());
			x.setCarbohidrati(pui.getCarbohidrati());
			x.setGrasimi(pui.getGrasimi());
			
		
		}
		
		if(showPassword2.isSelected()) {
			
			x.setNume(vita.getNume());
			x.setCalorii(vita.getCalorii());
			x.setProteine(vita.getProteine());
			x.setCarbohidrati(vita.getCarbohidrati());
			x.setGrasimi(vita.getGrasimi());
			
		
		}
		if(showPassword3.isSelected()) {
			
			x.setNume(peste.getNume());
			x.setCalorii(peste.getCalorii());
			x.setProteine(peste.getProteine());
			x.setCarbohidrati(peste.getCarbohidrati());
			x.setGrasimi(peste.getGrasimi());
			
		
		}
		if(showPassword4.isSelected()) {
	
			x.setNume(curcan.getNume());
			x.setCalorii(curcan.getCalorii());
			x.setProteine(curcan.getProteine());
			x.setCarbohidrati(curcan.getCarbohidrati());
			x.setGrasimi(curcan.getGrasimi());
	

		}
		
		if(e.getSource() == ok) {
			
			String out = foodTextField.getText();
			int numr =Integer.parseInt(out);
			
			x.setCalorii((x.getCalorii()*numr)/100);
			x.setProteine((x.getProteine()*numr)/100);
			x.setCarbohidrati((x.getCarbohidrati()*numr)/100);
			x.setGrasimi((x.getGrasimi()*numr)/100);
			
			
			JOptionPane.showMessageDialog(this, x.toString());
			showPassword1.setSelected(false);
			showPassword2.setSelected(false);
			showPassword3.setSelected(false);
			showPassword4.setSelected(false);
			foodTextField.setText("");
		}
		
	}
	
}
