import java.sql.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibraryManagementSystem {

	private JFrame frame;
	private final Panel panel = new Panel();
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryManagementSystem window = new LibraryManagementSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibraryManagementSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 692, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(0, 0, 692, 96);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Library Management System");
		label.setFont(new Font("Verdana", Font.BOLD, 25));
		label.setBounds(173, 10, 400, 76);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(254, 157, 180, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(254, 222, 180, 20);
		frame.getContentPane().add(passwordField);
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{		
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shivananda","12345678");	
			String query ="select * from lmsuserdb where username=? and password=?";
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setString(1, textField.getText());
			pst.setString(2, passwordField.getText());
			ResultSet rs=pst.executeQuery();
			int count=0;
			while(rs.next())
			{
				count=count+1;
			}
			if(count==1)
			{
				JOptionPane.showMessageDialog(null," USERNAME AND PASSWORD IS CORRECT");
				frame.dispose();
				lms obj=new lms();
				obj.setVisible(true);
				
			}
			else if(count>1){
				JOptionPane.showMessageDialog(null," DUPLICATE USERNAME AND PASSWORD");
			}
			else
			{
				JOptionPane.showMessageDialog(null," USERNAME AND PASSWORD IS INCORRECT TRY AGAIN.....");
			}
			rs.close();
			pst.close();
				}
				catch(Exception e)
				{
					System.out.println(e);	
				}
				
				
				
			}
		});
		button.setFont(new Font("Verdana", Font.BOLD, 14));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 191, 255));
		button.setBounds(296, 288, 100, 35);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBackground(new Color(255, 0, 0));
		button_1.setBounds(10, 408, 70, 22);
		frame.getContentPane().add(button_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Shivananda\\Downloads\\Compressed\\Icon Pack\\Icon Pack\\24\\Messaging\\sa.png"));
		label_1.setBounds(221, 142, 33, 53);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Shivananda\\Downloads\\Compressed\\Icon Pack\\Icon Pack\\24\\Security\\sa.png"));
		label_2.setBounds(221, 209, 46, 46);
		frame.getContentPane().add(label_2);
		
		Button button_2 = new Button("Sign up");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
		       signup obj=new signup();
		       obj.setVisible(true);		       
			}
		});
		button_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		button_2.setBackground(new Color(0, 191, 255));
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBounds(607, 408, 75, 22);
		frame.getContentPane().add(button_2);
	}
}
