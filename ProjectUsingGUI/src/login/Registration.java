package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registration {
	public void register()
	{
		
	JFrame f=new JFrame("Registration");
	JButton area=new JButton("WELCOME TO PORTAL REGISTRATION");
	area.setBounds(90, 20, 240, 20);
	final JTextField tf1,tf2,tf3,tf6,tf7;
	JLabel l1,l2,l3,l4,l5,l6,l9,l7,lresult1,lresult2,lresult3,lresult4,lresult5,lresult6,lresult7,tfresult1,tfresult2,tfresult3,tfresult4,tfresult5,tfresult6,tfresult7;
	l1=new JLabel("FirstName");
	l1.setBounds(50, 50, 100, 30);
	 tf1 = new JTextField();
	tf1.setBounds(200, 50, 200, 30);
	
	l2=new JLabel("LastName");
	l2.setBounds(50, 100, 100, 30);
	 tf2 = new JTextField();
	tf2.setBounds(200, 100, 200, 30);

	l3=new JLabel("UserID");
	l3.setBounds(50, 150, 100, 30);
	 tf3 = new JTextField();
	tf3.setBounds(200, 150, 200, 30);

	l4=new JLabel("Password");
	l4.setBounds(50, 200, 100, 30);
	JPasswordField tf4=new JPasswordField();
	tf4.setBounds(200, 200, 200, 30);
	

	l5=new JLabel("Re-Password");
	l5.setBounds(50, 250, 100, 30);
	JPasswordField tf5=new JPasswordField();
	tf5.setBounds(200, 250, 200, 30);
	
	
	JCheckBox c1=new JCheckBox("F");
	JCheckBox c2=new JCheckBox("M");

	l9=new JLabel("Gender");
	l9.setBounds(50, 300, 100, 30);
	c1.setBounds(200, 300, 100, 30);
	c2.setBounds(300, 300, 100, 30);
	
	l6=new JLabel("Mobile Number");
	l6.setBounds(50, 350, 100, 30);
	 tf6 = new JTextField();
	tf6.setBounds(200, 350, 200, 30);


	l7=new JLabel("Email Id");
	l7.setBounds(50, 400, 100, 30);
	 tf7 = new JTextField();
	tf7.setBounds(200, 400, 200, 30);

	 lresult1 = new JLabel("FirstName:");
	lresult1.setBounds(50, 490, 200, 30);
	
	 lresult2 = new JLabel("LastName");
	lresult2.setBounds(50, 520, 200, 30);
	 lresult3 = new JLabel("UserID:");
	lresult3.setBounds(50, 550, 200, 30);
	 lresult4 = new JLabel("Password:");
	lresult4.setBounds(50, 580, 200, 30);
	lresult5 = new JLabel("Reset Password:");
	lresult5.setBounds(50, 610, 200, 30);
	 lresult6 = new JLabel("Mobile Number:");
	lresult6.setBounds(50, 640, 200, 30);
	 lresult7 = new JLabel("Email ID:");
	lresult7.setBounds(50, 670, 200, 30);

	 tfresult1 = new JLabel();
	 tfresult1.setBounds(200, 490, 200, 30);
	 String fname=tfresult1.getText();
		
	 tfresult2 = new JLabel();
	 tfresult2.setBounds(200, 520, 200, 30);
	 String Lname=tfresult2.getText();
	 
	 tfresult3 = new JLabel();
	 tfresult3.setBounds(200, 550, 200, 30);
	 String UserId=tfresult3.getText();
	 
	 tfresult4 = new JLabel();
	 tfresult4.setBounds(200, 580, 200, 30);
	 String password=tfresult4.getText();
	 
	 tfresult5 = new JLabel();
	 tfresult5.setBounds(200, 610, 200, 30);
	 String repassword=tfresult5.getText();
	 
	 tfresult6= new JLabel();
	 tfresult6.setBounds(200, 640, 200, 30);
	 String mobile=tfresult6.getText();
	 
	 tfresult7 = new JLabel();
	 tfresult7.setBounds(200, 670, 200, 30);
	 String email=tfresult7.getText();

	//final JTextField tf=new JTextField();
	//tf.setBounds(50, 350, 150, 20);
	JButton b=new JButton("Login");
	b.setBounds(130, 450, 150, 35);
	b.addActionListener(new ActionListener() {
		
		//@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			

			tfresult1.setText(tf1.getText());
			tfresult2.setText(tf2.getText());
			tfresult3.setText(tf3.getText());
			tfresult4.setText(tf4.getText());
			tfresult5.setText(tf5.getText());
			tfresult6.setText(tf6.getText());
			tfresult7.setText(tf7.getText());
			Login c=new Login();
			Statement statement;
			try {
				Connection cm=c.connection();
				statement=cm.createStatement();

				statement.execute("INSERT INTO registration values('"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"',"+tf6.getText()+",'"+tf7.getText()+"Registration done sucessfully!!!!!)");
				//{
					//System.out.println("Registration done succesfully");
				//as}
			} catch (SQLException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	

		}
	});
	f.add(area);f.add(tf4);f.add(tf5);f.add(l9);f.add(c1);f.add(c2);
	f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);f.add(tf5);f.add(tf6);f.add(tf7);
	f.add(lresult1);f.add(lresult2);f.add(lresult3);f.add(lresult4);f.add(lresult5);f.add(lresult6);f.add(lresult7);
	

	f.add(tfresult1);f.add(tfresult2);f.add(tfresult3);f.add(tfresult4);f.add(tfresult5);f.add(tfresult6);f.add(tfresult7);

	
	f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);


	f.add(b);
	f.setSize(800, 800);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//deallocation for memory
}
}


