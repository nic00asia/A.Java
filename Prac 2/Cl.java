import java.io.*;
import java.net.*;
import java.util.*;
public class Cl
{
public static void main(String args[]) throws Exception
{
Socket s=new Socket("localhost",777);
DataOutputStream ds=new DataOutputStream(s.getOutputStream());
Scanner sc = new Scanner(System.in);
System.out.println("enter string");
String str= sc.nextLine();
ds.writeUTF(str);
ds.flush();
DataInputStream din=new DataInputStream(s.getInputStream());
System.out.println("string");
String x=din.readUTF();
System.out.println(x);
ds.close();
din.close();
s.close();
}
}