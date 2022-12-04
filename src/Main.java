import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
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
