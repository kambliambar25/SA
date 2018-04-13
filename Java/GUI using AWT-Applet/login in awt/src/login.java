import java.awt.*;
import java.awt.event.*;
public class login extends Frame implements ActionListener {
	TextField a,b;
	Button c;
	Label l;
	login()
{	
	a=new TextField();
	a.setBounds(180,150,100,50);
	b=new TextField();
	b.setBounds(180,200,100,50);
	c=new Button("Login");
	c.setBounds(180,300,100,50);
	c.addActionListener(this);
	l=new Label();
	l.setBounds(180,250,300,300);
	add(a);
	add(b);
	add(c);
	add(l);
	setSize(500,500);
	setLayout(null);
	setVisible(true);
}
	public void actionPerformed(ActionEvent e)
	{
		String user=a.getText();
		String pass=b.getText();
		if(user.equals("admin") && pass.equals("admin123"))
		{
			l.setText("Login Granted");
		}
		else {
			l.setText("Login Denied");
		}
	}	
	public static void main(String[] args) {
    new login();
	}
}
