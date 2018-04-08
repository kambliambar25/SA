package addsubmuldiv;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class addsubmuldiv {

	private JFrame frmSimpleCalculator;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addsubmuldiv window = new addsubmuldiv();
					window.frmSimpleCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addsubmuldiv() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimpleCalculator = new JFrame();
		frmSimpleCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Images\\SA Logo SEND.jpg"));
		frmSimpleCalculator.setForeground(Color.LIGHT_GRAY);
		frmSimpleCalculator.setTitle("Simple Calculator");
		frmSimpleCalculator.getContentPane().setBackground(Color.YELLOW);
		frmSimpleCalculator.setBounds(100, 100, 450, 300);
		frmSimpleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(162, 34, 86, 20);
		frmSimpleCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 72, 86, 20);
		frmSimpleCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int num1 = Integer.parseInt(textField.getText());
			int num2 = Integer.parseInt(textField_1.getText());
		    int value = num1 + num2;
		textField_2.setText(Integer.toString(value));
			}
		});
		btnNewButton.setBounds(72, 132, 89, 23);
		frmSimpleCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtraction");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					int num1 = Integer.parseInt(textField.getText());
					int num2 = Integer.parseInt(textField_1.getText());
				    int value = num1 - num2;
				textField_2.setText(Integer.toString(value));
			}
		});
		btnNewButton_1.setBounds(242, 132, 106, 23);
		frmSimpleCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplication");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField_1.getText());
			    int value = num1 * num2;
			textField_2.setText(Integer.toString(value));
			}
		});
		btnNewButton_2.setBounds(61, 178, 118, 23);
		frmSimpleCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Division");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField_1.getText());
			    int value = num1 / num2;
			textField_2.setText(Integer.toString(value));
			}
		});
		btnNewButton_3.setBounds(249, 178, 89, 23);
		frmSimpleCalculator.getContentPane().add(btnNewButton_3);
		
		JLabel lblEnterstNo = new JLabel("Enter 1st no.");
		lblEnterstNo.setBounds(54, 31, 98, 20);
		frmSimpleCalculator.getContentPane().add(lblEnterstNo);
		
		JLabel lblEnterndNo = new JLabel("Enter 2nd no.");
		lblEnterndNo.setBounds(53, 72, 86, 17);
		frmSimpleCalculator.getContentPane().add(lblEnterndNo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(294, 55, 86, 20);
		frmSimpleCalculator.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setBounds(317, 31, 51, 23);
		frmSimpleCalculator.getContentPane().add(lblAnswer);
	}
}
