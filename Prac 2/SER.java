import java.io.*;
import java.net.*;
import java.util.*;
public class SER
{
public static void main(String args[]) throws IOException
{
ServerSocket ss=new ServerSocket(777);
Socket s=ss.accept();
DataInputStream din=new DataInputStream(s.getInputStream());
String str= din.readUTF();
StringBuffer x = new StringBuffer();
x.append(str);
x.reverse();
String y=x.toString();
DataOutputStream ds=new DataOutputStream(s.getOutputStream());
ds.writeUTF(y);
ds.flush();
ds.close();
din.close();
ss.close();
s.close();
}
}