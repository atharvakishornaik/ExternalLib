package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI implements ActionListener
{
	static JTextField ID = new JTextField();
	static JPasswordField Password = new JPasswordField();
	static int count = 0;
	
	
	public GUI()
	{
		JFrame frame = new JFrame("Login");
		JPanel contentPane = new JPanel();
		JMenu Option1 = new JMenu("File");
		JMenu Option2 = new JMenu("Help");
		JMenu Option3 = new JMenu("Extra");
		
		JMenuBar menubar = new JMenuBar();
		
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem info = new JMenuItem("Info");
		JMenuItem Extra1 = new JMenuItem("Extra1");
		JMenuItem Extra2 = new JMenuItem("Extra2");
		JMenuItem Extra3 = new JMenuItem("Extra3");
		JMenuItem Extra4 = new JMenuItem("Extra4");
		
		JLabel Label1 = new JLabel("Login:");
		JLabel Label2 = new JLabel("Password:");
		
		JButton button = new JButton("Login");
		
		
		
		frame.setContentPane(contentPane);
		frame.setSize(260, 300);
		frame.setLocationRelativeTo(null);
		
		
		contentPane.add(menubar);
		
		
		
		menubar.add(Option1);
		menubar.add(Option2);
		menubar.add(Option3);
		
		
		Option1.add(exit);
		exit.addActionListener(this);
		
		
		Option2.add(info);
		info.addActionListener(this);	
		
		
		Option3.add(Extra1);
		Option3.addSeparator();
		Extra1.addActionListener(this);
		
		
		Option3.add(Extra2);
		Option3.addSeparator();
		Extra2.addActionListener(this);
		
		
		Option3.add(Extra3);
		Option3.addSeparator();
		Extra3.addActionListener(this);
		
		
		Option3.add(Extra4);
		Extra4.addActionListener(this);
		
		frame.setJMenuBar(menubar);
		
		
		contentPane.add(Label1);
		
		
		contentPane.add(ID);
		ID.setColumns(20);
		
		
		
		contentPane.add(Label2);
		
	
		Password.setColumns(20);
		contentPane.add(Password);
		
		
		contentPane.add(button);
		button.addActionListener(this);
		
		
		frame.setVisible(true);


		
		// TODO Auto-generated method stub
		
		
		

		
	}
	  
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source instanceof JMenuItem)
		{
			String MenuItemName = ((JMenuItem) source).getText();
			if( MenuItemName.equals("Exit"))
			{
				System.exit(0);
			}
			if(MenuItemName.equals("Info"))
			{
				System.out.println("info");
			}
			if(MenuItemName.equals("Extra1"))
			{
				System.out.println("Extra1");
			}
			if(MenuItemName.equals("Extra2"))
			{
				System.out.println("Extra2");
			}
			if(MenuItemName.equals("Extra3"))
			{
				System.out.println("Extra3");
			}
			if(MenuItemName.equals("Extra4"))
			{
				System.out.println("Extra4");
			}

		}
		if(source instanceof JButton)
		{
			String id = ID.getText();
			String pass = Password.getText();
			if(!(id.isEmpty()) && !(pass.isEmpty()))
			{
				System.exit(0);
			}	
			if(count >= 3)
			{
				System.out.println("WARNUNG");
			}
			count++;
		}
		// TODO Auto-generated method stub
		

	}

	public static void main(String[] args)
	{
		new GUI();
	}

}
