import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class FoodWindow extends JFrame implements ActionListener{
	 JFrame frame = new JFrame();
	 JButton backButton = new JButton("Inapoi");
	 
	 
	 
	 
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public FoodWindow() throws HeadlessException 
	{
		
	
		//Sample 01: Set Size and Position
	
		Container ControlHost = getContentPane();
		ControlHost.setLayout(new FlowLayout());
		
		//Sample 11: Create Model & List Item Painter
		MancareModel model = new MancareModel();
		MancareViz painter = new MancareViz();
		JList list = new JList(model);
		list.setCellRenderer(painter);
		list.setVisibleRowCount(7);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		
		
		ControlHost.add(backButton);
		Color color=new Color(25, 195 ,247);
		//Sample 12: Create Scroll Pane and add
		JScrollPane jcp = new JScrollPane(list);
		ControlHost.setBackground(color);
		ControlHost.add(jcp);
		jcp.setPreferredSize(new Dimension(300, 700));
		
		


		
		frame.add(ControlHost);
		frame.setVisible(true);
		frame.setBounds(10,10,1080,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setResizable(false);
		  frame.getContentPane().setBackground(color);
		  frame.setTitle("Grab a bite");
		  
		 
	
		  backButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
			frame.setVisible(false);
			AlegeOptiuni ma = new AlegeOptiuni();
		}
		
	}
}
