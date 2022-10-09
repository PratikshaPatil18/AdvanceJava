// create login form using textfield .
import java.awt.*;
class TextDemo extends Frame
{
 TextDemo()
 {
	 setLayout(null);
	 //setBackground(color.cyan);
	 //setForeground(color.red);
	 Label l1=new Label("Amplifire Electronics PVT.LMT",Label.RIGHT);
	 Label l2=new Label("Entre username:",Label.RIGHT);
	 Label l3=new Label("Entre Password:",Label.RIGHT);
	 TextField tf1=new TextField(20);
	 TextField tf2=new TextField(20);
	 Button b1=new Button("Login");
		l1.setBounds(100,50,200,30); 
		l2.setBounds(70,100,120,30);
		l3.setBounds(210,100,100,30);
		tf1.setBounds(70,150,120,30);
		tf2.setBounds(210,150,100,30);
		b1.setBounds(140,200,80,30);
		tf2.setEchoChar('*');
	 add(l1);
	 add(l2);
	 add(l3);
	 add(tf1);
	 add(tf2);
	 add(b1);
 }
 public static void main(String a[])
 {
 TextDemo td=new TextDemo();
 td.setVisible(true);
 td.setTitle("Amplifire Login page");
 td.setSize(500,500);
 }
}