import java.net.*;
import java.io.*;
class senddemo
{
public static void main (String a[])throws IOException
	 {
		 DatagramSocket ds = new DatagramSocket();
		 byte d[] = "Welcome on my page.".getBytes();
		 int len = d.length;
		 InetAddress add =InetAddress.getByName("127.0.0.1");
		 DatagramPacket dp = new DatagramPacket(d,len,add,8181);
		 ds.send(dp);
		 ds.close();
	 }
}
