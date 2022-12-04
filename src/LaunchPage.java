import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class LaunchPage extends JFrame implements ActionListener{
	 JFrame frame = new JFrame();
	 Container container = getContentPane();
	 JLabel userLabel = new JLabel("USERNAME");
	 JLabel passwordLabel = new JLabel("PAROLA");
	 JTextField userTextField = new JTextField();
	 JPasswordField passwordField = new JPasswordField();
	 JButton loginButton = new JButton("Autentificare");
	 JButton registerButton = new JButton("Inregistrare");
	 JButton adminButton = new JButton("Admin");
	 JCheckBox showPassword = new JCheckBox("Afiseaza parola");
	 JLabel logo = new JLabel();
	 JButton exitButton = new JButton("Iesire");
	 
	 
	 LaunchPage(){
		 	setLayoutManager();
	        setLocationAndSize();
	        addComponentsToContainer();
	        addActionEvent();
	 }
	 
	 public void setLayoutManager() {
	        container.setLayout(null);
	    }
	 
	 public void setLocationAndSize() {
		 logo.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Grab a bite.png"));
		 Dimension size = logo.getPreferredSize();
		 logo.setBounds(180, 0, 680, 271);
		 
		 
	        userLabel.setBounds(350, 280, 100, 30);
	        passwordLabel.setBounds(350, 320, 100, 30);
	        userTextField.setBounds(450, 280, 150, 30);
	        passwordField.setBounds(450, 320, 150, 30);
	        showPassword.setBounds(450, 360, 150, 30);
	        loginButton.setBounds(350, 400, 110, 30);
	        registerButton.setBounds(550, 400, 100, 30);
	        adminButton.setBounds(930,600,120,40);
	        exitButton.setBounds(20,600,120,40);
	       
	 
	    }
	 
	 public void addComponentsToContainer() {
	        container.add(userLabel);
	        container.add(passwordLabel);
	        container.add(userTextField);
	        container.add(passwordField);
	        container.add(showPassword);
	        container.add(loginButton);
	        container.add(registerButton);
	        container.add(adminButton);
	        container.add(logo);
	        container.add(exitButton);
	        
	        Color color=new Color(25, 195 ,247);
	        showPassword.setBackground(color);
	        showPassword.setOpaque(true);
	    }
	 
	 public void addActionEvent() {
	        loginButton.addActionListener(this);
	        registerButton.addActionListener(this);
	        adminButton.addActionListener(this);
	        showPassword.addActionListener(this);
	        exitButton.addActionListener(this);
	    }
	 @Override
	 public void actionPerformed(ActionEvent e) {
	  
		 Client a = new Client("matei1","matei2","Marius Matei","Lalelei 44","mariuscasanova@messi.com","777835467");
		 Client b = new Client("alex12","alex123","Alex Marius","Bobocului 11","alexu@gmail.com","777312341");
		 Client c = new Client("dan44","daniel","Dan Daniel","Tulpinei 22","danal22@yahoo.com","77732117");
		 Client d = new Client("emil2","emil22","Emil Racovita","Take Ionescu 66","elenski2@e-uvt.ro","777832367");
		 
		 List<Client> l = new ArrayList<Client>();
		 l.add(a);
		 l.add(b);
		 l.add(c);
		 l.add(d);
		 
		 
		 
	  if(e.getSource()==registerButton) {
	   dispose();
	   NewWindow myWindow = new NewWindow();
	  }
	  if (e.getSource() == loginButton) {
          String userText2 = userTextField.getText();
          String pwdText2 = passwordField.getText();
          
          String w1 = "w1";
          String w2 = "w2";
          
          for(Client i : l) {
        	  String uname = i.getUsername();
        	  String parol = i.getPassword();
        	  if(userText2.equalsIgnoreCase(uname) && pwdText2.equalsIgnoreCase(parol)) {
        		  w1 = uname;
        		  w2 = parol;
        	  }
        		  
          }
          if (w1 != "w1" && w2 != "w2") {
              JOptionPane.showMessageDialog(this, "Autentificare reusita!");
              AlegeOptiuni dada = new AlegeOptiuni();
              dispose();
          } else {
              JOptionPane.showMessageDialog(this,"Username sau parola gresita!");
              userTextField.setText("");
              passwordField.setText("");
          }

      }
   
      if (e.getSource() == showPassword) {
          if (showPassword.isSelected()) {
              passwordField.setEchoChar((char) 0);
          } else {
              passwordField.setEchoChar('*');
          }
      }
      
      if(e.getSource() == adminButton) {
    	  dispose();
    	  AdminWindow admWindow = new AdminWindow();
    	  
      }
      
      if(e.getSource() == exitButton) {
    	  this.dispose();
      }
      
      
      
	 }

	
	 
}

