import java.io.*;
import java.net.*;
import java.util.*;
public class SER
{
public static void main(String args[]) throws IOException
{
ServerSocket ss=new ServerSocket(777);
Socket s=ss.accept();
int i,sum=0;
String str;
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
while((str=din.readUTF())!=null)
{
System.out.println("The Number Sends by Client is:"+str);
i=Integer.parseInt(str);
sum=sum+i;
dout.writeUTF(Integer.toString(sum));
}



dout.flush();
din.close();
dout.close();
ss.close();
s.close();
}
}