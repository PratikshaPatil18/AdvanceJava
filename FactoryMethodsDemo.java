import java.net.*;
class FactoryMethodsDemo
{
 public static void main(String a[])throws UnknownHostException
	{
	InetAddress add=InetAddress.getLocalHost();
	System.out.println(add);
	InetAddress add1=InetAddress.getByName("msbte.org.in");
	System.out.println(add1);
	InetAddress add2[]=InetAddress.getAllByName("www.google.com");
	for(int i=0;i<add2.length;i++)
	System.out.println(add2[i]);
	}
}