package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	
		protected static final String UserName = null;
		protected static final String PASSWORD = null;

		public Connection connection() throws ClassNotFoundException, SQLException {
	
 
		//public static void main(String[] args) 
			// TODO Auto-generated method stub
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook","root","");  
			return con;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f=new JFrame("Login");
	
		JLabel l11,l12,l13,l14;
	    JTextField tf11;
		l11=new JLabel("user name");
		l11.setBounds(50, 40, 240, 20);
		tf11 = new JTextField();
		tf11.setBounds(250, 40, 200, 20);

	
		l12=new JLabel("Password");
		l12.setBounds(50, 80, 240, 20);
		JPasswordField value=new JPasswordField();
		value.setBounds(250, 80, 200, 20);
		//tf12 = new JTextField();
		//tf12.setBounds(250, 80, 200, 20);
		
		JButton b=new JButton("Login");
		b.setBounds(160, 120, 150, 20);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Login c=new Login();
				Statement statement;
				try {
					Connection cm=c.connection();
					statement=cm.createStatement();
					 String UserName=tf11.getText();
					 String password=value.getText();

					statement.executeUpdate("Select UserId,password FROM registration where UserId='"+UserName+"' and password='"+password+"'");
				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println("Duplicate id");
					//e1.printStackTrace();
				}	
				
			}
			
		});
		
		l13=new JLabel("-----------------------------------------or--------------------------------------------------");
		l13.setBounds(50, 160, 450, 20);
		
		//l4=new JLabel("FirstName");
		//l4.setBounds
		
		JButton b1=new JButton("Create a new account");
		b1.setBounds(100, 200, 250, 20);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Registration r=new Registration();
				r.register();
				
			}

		
		});
		f.add(value);

		f.add(tf11);//f.add(tf12);
		f.add(l11);f.add(l12);f.add(l13);
		
		f.add(b);f.add(b1);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);

		
	}

}
