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

public class AdminPanel extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	 Container container = getContentPane();
	 JButton stergeButton = new JButton("Sterge Client");
	 JLabel userLabel = new JLabel("Username client");
	 JTextField userTextField = new JTextField();
	 JLabel logo = new JLabel();
	 JButton backButton = new JButton("Inapoi");
	 JButton showButton = new JButton("Arata clienti");
	 private String numele = "x";
	 
	 
	 AdminPanel(){
		 
		 logo.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Grab a bite.png"));
		 Dimension size = logo.getPreferredSize();
		 logo.setBounds(180, 0, 680, 271);
		 
		 container.setLayout(null);
		 userLabel.setBounds(350, 300, 100, 30);
		 userTextField.setBounds(450, 300, 150, 30);
		 stergeButton.setBounds(470, 350, 110, 30);
		 backButton.setBounds(930,600,120,40);
		 showButton.setBounds(470,400,130,30);
		 
		 frame.add(userLabel);
		 frame.add(userTextField);
		 frame.add(stergeButton);
		 frame.add(logo);
		 frame.add(backButton);
		 frame.add(showButton);
		 
		 stergeButton.addActionListener(this);
		 backButton.addActionListener(this);
		 showButton.addActionListener(this);
		 
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
		Client a = new Client("matei1","matei2","Marius Matei","Lalelei 44","mariuscasanova@messi.com","777835467");
		 Client b = new Client("alex12","alex123","Alex Marius","Bobocului 11","alexu@gmail.com","777312341");
		 Client c = new Client("dan44","daniel","Dan Daniel","Tulpinei 22","danal22@yahoo.com","77732117");
		 Client d = new Client("emil2","emil22","Emil Racovita","Take Ionescu 66","elenski2@e-uvt.ro","777832367");
		 
		 List<Client> l = new ArrayList<Client>();
		 l.add(a);
		 l.add(b);
		 l.add(c);
		 l.add(d);
		if(e.getSource() == stergeButton) {
			String userText2 = userTextField.getText();
	        String w1 = "w1";
	          
	        for(Client i : l) {
	        	  String uname = i.getUsername();
	        	  if(userText2.equalsIgnoreCase(uname)) {
	        		  w1 = uname;
	        		  numele = w1;
	        	  }
	        		  
	          }
	          if (w1 != "w1") {
	              JOptionPane.showMessageDialog(this, "Client gasit si sters!");
	              
	              userTextField.setText("");
	          }
	          else {
	        	  JOptionPane.showMessageDialog(this, "Clientul nu a fost gasit!");
	        	  userTextField.setText("");
	        	  }
			
		
		}
		
		if(e.getSource() == backButton) {
			frame.setVisible(false);
			AdminWindow exit = new AdminWindow();
		}
		
		String mesaj = "\n Clienti \n";
		if(e.getSource() == showButton) {
			for(Client i : l) {
				if(i.getUsername() != numele)
				mesaj += i.toString() + '\n';
				else
					continue;
			}
			JOptionPane.showMessageDialog(this, mesaj);
		}
			
		
	}
}
