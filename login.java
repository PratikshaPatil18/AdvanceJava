
import javax.swing.*;          //JFrame class
import java.awt.*;             //color
public class login extends JFrame implements ActionListener       //for action(hover)
 
{
 public login()
 {
	ImageIcon i= new ImageIcon (ClassLoader.getSystemResource("icons/login.jpeg"));   //putting img
	JLabel img = new JLabel(i);
	 
	setLayout(null);        // remove actual layout
	 
	add (img) ;         //upload on frame
	 
	img.setBounds(0,0,600,500); //actual position for img
	 
	JLabel heading = new JLabel("simple minds"); 	//heading on framehead
	heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
	heading.setForeground(Color.BLUE);
	
	heading.setBounds(750,60,300,45);
	
	add(heading);
	
	JLabel name = new JLabel("Enter Your Name "); 	//heading on framehead
	name.setFont(new Font("Mongo",Font.BOLD,14));
	name.setForeground(Color.BLUE);
	
	name.setBounds(800,170,300,20);
	
	add(name);
	
	JTextField tf= new JTextField();
	tf.setBounds(735,200,250,20);
	add(tf);
	
	
	getContentPane().setBackground(Color.WHITE);   //set entire window color
	setSize(1000,500);
	setLocation(200,200);
    setVisible(true);
	
	JButton b= new JButton("Rules");
	b.setBounds(760,270,100,25);
	b.setBackground(new Color(30,144,254));
	b.setForeground(Color.WHITE);
	b.addActionListener();
	
	
	add(b);
	
	JButton back= new JButton("Back");
	back.setBounds(900,270,100,25);
	back.setBackground(new Color(30,144,254));
	back.setForeground(Color.WHITE);
	back.addActionListener();
	
	add(back);
 }

public void actionPerformed(ActionEvent ae)
{
	if(
}
 public static void main(String args[])
 {
  login l= new login();
  
 }
}