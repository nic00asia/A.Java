import java.io.*;
import java.net.*;
import java.util.*;
public class Client
{
public static void main(String args[]) throws Exception
{
Socket s=new Socket("localhost",777);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
dout.writeUTF(str);
DataInputStream din=new DataInputStream(s.getInputStream());
String str1;
while((str1=din.readUTF())!=null)
{
System.out.println(str1);
}
dout.close();
din.close();
sc.close();
s.close();
}
}