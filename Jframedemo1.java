//create jframe using string constructor
import javax.swing.*;
class Jframedemo1 extends JFrame
{
  Jframedemo1(String str)
  {
  super(str);
  }
  public static void main(String a[])
  {
   Jframedemo1 jf=new Jframedemo1("My Jframe");
   
   jf.setVisible(true);
   jf.setSize(500,500);
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}