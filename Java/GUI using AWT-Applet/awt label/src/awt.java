import java.awt.*;
class awt{
public static void main(String args[])
{
Frame f= new Frame("Label Example");
Label l1;
l1=new Label("Shivananda Alva");
l1.setBounds(150,150, 150,100);
f.add(l1);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
}