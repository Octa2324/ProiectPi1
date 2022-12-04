import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class NewWindow extends JFrame implements ActionListener{

 JFrame frame = new JFrame();
 Container container = getContentPane();
 JLabel userLabel = new JLabel("USERNAME");
 JLabel passwordLabel = new JLabel("PAROLA");
 JLabel nameLabel = new JLabel("NUME");
 JLabel adresaLabel = new JLabel("ADRESA");
 JLabel emailLabel = new JLabel("EMAIL");
 JLabel numarLabel = new JLabel("NUMAR");
 JTextField userTextField = new JTextField();
 JPasswordField passwordField = new JPasswordField();
 JTextField nameTextField = new JTextField();
 JTextField adresaTextField = new JTextField();
 JTextField emailTextField = new JTextField();
 JTextField numarTextField = new JTextField();
 JButton inregistrareButton = new JButton("Inregistrare");
 JButton emptyButton = new JButton("Golire");
 JLabel logo = new JLabel();
 JButton backButton = new JButton("Inapoi");
 
 
 NewWindow(){
  
	 logo.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Grab a bite.png"));
	 Dimension size = logo.getPreferredSize();
	 logo.setBounds(180, 0, 680, 271);
	 
	 container.setLayout(null);
	 userLabel.setBounds(350, 280, 100, 30);
     passwordLabel.setBounds(350, 320, 100, 30);
     userTextField.setBounds(450, 280, 150, 30);
     passwordField.setBounds(450, 320, 150, 30);
     nameLabel.setBounds(350,360,100,30);
     nameTextField.setBounds(450,360,150,30);
     adresaLabel.setBounds(350,400,100,30);
     adresaTextField.setBounds(450,400,150,30);
     emailLabel.setBounds(350,440,100,30);
     emailTextField.setBounds(450,440,150,30);
     numarLabel.setBounds(350,480,100,30);
     numarTextField.setBounds(450,480,150,30);
     inregistrareButton.setBounds(550,550,100,30);
     emptyButton.setBounds(400,550,100,30);
     backButton.setBounds(930,600,120,40);
     
  
  frame.add(userLabel);
  frame.add(passwordLabel);
  frame.add(userTextField);
  frame.add(passwordField);
  frame.add(nameLabel);
  frame.add(nameTextField);
  frame.add(adresaLabel);
  frame.add(adresaTextField);
  frame.add(emailLabel);
  frame.add(emailTextField);
  frame.add(numarLabel);
  frame.add(numarTextField);
  frame.add(inregistrareButton);
  frame.add(emptyButton);
  frame.add(logo);
  frame.add(backButton);
  
  inregistrareButton.addActionListener(this);
  emptyButton.addActionListener(this);
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
	
	if(e.getSource() == inregistrareButton) {
		Client x = new Client();
		x.setUsername(userTextField.getText());
		x.setParola(passwordField.getText());
		x.setNume(nameTextField.getText());
		x.setAdresa(adresaTextField.getText());
		x.setEmail(emailTextField.getText());
		x.setNumar(numarTextField.getText());
		
		JOptionPane.showMessageDialog(this, "Contul a fost inregistrat!");
	}
	if(e.getSource() == emptyButton) {
		userTextField.setText("");
        passwordField.setText("");
        nameTextField.setText("");
        adresaTextField.setText("");
        emailTextField.setText("");
        numarTextField.setText("");
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