import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Window.Type;
import javax.swing.JSeparator;

public class SimpleLoginpage {

	private JFrame frmLoginPge;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleLoginpage window = new SimpleLoginpage();
					window.frmLoginPge.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleLoginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPge = new JFrame();
		frmLoginPge.setUndecorated(true);
		frmLoginPge.setBackground(Color.WHITE);
		frmLoginPge.setType(Type.POPUP);
		frmLoginPge.setTitle("Login Page");
		frmLoginPge.getContentPane().setBackground(Color.ORANGE);
		frmLoginPge.setBounds(100, 100, 550, 350);
		frmLoginPge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginPge.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Shivananda\\Downloads\\Compressed\\Icons\\Icons\\Person-Male-Light-icon-1.png"));
		lblNewLabel.setBounds(196, 11, 182, 53);
		frmLoginPge.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(120, 75, 92, 44);
		frmLoginPge.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(120, 146, 92, 37);
		frmLoginPge.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		String s1=textField.getText();
		String s2=passwordField.getText();	
		if(s1.equals("admin") && s2.equals("admin123"))
		{
			JOptionPane.showMessageDialog(null, "Welcome Shivananda");	
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
		}
		
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(222, 228, 104, 37);
		frmLoginPge.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(222, 88, 137, 20);
		frmLoginPge.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(222, 156, 137, 20);
		frmLoginPge.getContentPane().add(passwordField);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				passwordField.setText(null);
				
			}
		});
		btnReset.setBounds(24, 277, 89, 23);
		frmLoginPge.getContentPane().add(btnReset);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 204, 472, 2);
		frmLoginPge.getContentPane().add(separator);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(422, 277, 89, 23);
		frmLoginPge.getContentPane().add(btnExit);
	}
}
