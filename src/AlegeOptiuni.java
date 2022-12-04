import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AlegeOptiuni extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	 Container container = getContentPane();
	 JLabel comanda = new JLabel("Comanda mancare");
	 JLabel calculator = new JLabel("Calculeaza calorii");
	 JButton comanda1 = new JButton("Comanda");
	 JButton calculator1 = new JButton("Calculator");
	 JButton backButton = new JButton("Inapoi");
	 JLabel logo = new JLabel();
	 
	 AlegeOptiuni(){
		 container.setLayout(null);
		 comanda.setBounds(250,300,120,30);
		 calculator.setBounds(550,300,100,30);
		 comanda1.setBounds(250,350,100,30);
		 calculator1.setBounds(550,350,100,30);
		 backButton.setBounds(930,600,120,40);
		 logo.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Grab a bite.png"));
		 Dimension size = logo.getPreferredSize();
		 logo.setBounds(180, 0, 680, 271);
		 
		 frame.add(comanda);
		 frame.add(calculator);
		 frame.add(comanda1);
		 frame.add(calculator1);
		 frame.add(logo);
		 frame.add(backButton);
		 
		 comanda1.addActionListener(this);
		 calculator1.addActionListener(this);
		 backButton.addActionListener(this);

		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setBounds(10, 10, 1080, 720);
		  frame.setLayout(null);
		  frame.setVisible(true);
		  frame.setResizable(false);
		  Color color=new Color(25, 195 ,247);
		  frame.getContentPane().setBackground(color);
		  frame.setTitle("Grab a bite");
		 
	 }
	 
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comanda1) {
			frame.setVisible(false);
			FoodWindow ala = new FoodWindow();
		}
		
		if(e.getSource() == calculator1) {
			frame.setVisible(false);
			CalculatorCalorii y = new CalculatorCalorii();
		}
		
		if(e.getSource() == backButton) {
			frame.setVisible(false);
			LaunchPage frame = new LaunchPage();
			frame.setTitle("Grab a bite");
	        frame.setVisible(true);
	        frame.setBounds(10, 10, 1080, 720);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	        Color color=new Color(25, 195 ,247);
	        frame.getContentPane().setBackground(color);
		}
		
	}

}
