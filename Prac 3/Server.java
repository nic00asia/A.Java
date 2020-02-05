import java.io.*;
import java.net.*;
import java.util.*;
public class Server
{
public static void main(String args[]) throws IOException
{
ServerSocket ss=new ServerSocket(777);
Socket s=ss.accept();
DataInputStream din =new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
String str=din.readUTF();
String b="";
int n=str.length();
for(int i=n-1;i>=0;i--)
{
b=b+str.charAt(i);
}
if(str.equalsIgnoreCase(b))
{
dout.writeUTF(str);
 dout.writeUTF("The string is palindrome.");
 }
 else
 {
dout.writeUTF(str);
 dout.writeUTF("The string is not palindrome.");
 }
dout.close();
din.close();
ss.close();
s.close();
}
}