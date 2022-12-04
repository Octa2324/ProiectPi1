import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AdminWindow extends JFrame implements ActionListener{

	JFrame frame = new JFrame();
	 Container container = getContentPane();
	 JLabel userLabel = new JLabel("COD");
	 JTextField userTextField = new JTextField();
	 JButton autentificareButton = new JButton("Autentificare");
	 JLabel logo = new JLabel();
	 JButton backButton = new JButton("Inapoi");
	 
	 AdminWindow(){
		 container.setLayout(null);
		 userLabel.setBounds(400, 300, 100, 30);
		 userTextField.setBounds(450, 300, 150, 30);
		 autentificareButton.setBounds(470, 350, 110, 30);
		 backButton.setBounds(930,600,120,40);
		 logo.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Grab a bite.png"));
		 Dimension size = logo.getPreferredSize();
		 logo.setBounds(180, 0, 680, 271);
		 
		 frame.add(userLabel);
		 frame.add(userTextField);
		 frame.add(autentificareButton);
		 frame.add(logo);
		 frame.add(backButton);
		 
		 autentificareButton.addActionListener(this);
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
		
		Admin a = new Admin("1245");
		Admin b = new Admin("4400");
		Admin c = new Admin("1233");
		Admin d = new Admin("123");
		
		List<Admin> l = new ArrayList<Admin>();
		l.add(a);
		l.add(b);
		l.add(c);
		l.add(d);
		
		if(e.getSource() == autentificareButton) {
			String userText=userTextField.getText();
			String w1 = "w1";
			
			for(Admin i : l) {
				
				String x = i.getCod();
				if(userText.equalsIgnoreCase(x))
					w1 = x;}
				
				if(w1 != "w1") {
					JOptionPane.showMessageDialog(this, "Autentificare acceptata!");
					frame.setVisible(false);
					AdminPanel myWindow1 = new AdminPanel();
					
					   
				}
				else {
					JOptionPane.showMessageDialog(this, "Codul este gresit!");
					userTextField.setText("");
				}
				
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


