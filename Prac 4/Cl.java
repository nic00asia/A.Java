import java.io.*;
import java.net.*;
import java.util.*;
public class Cl
{
public static void main(String args[]) throws Exception
{
Socket s=new Socket("localhost",777);
DataOutputStream dout= new DataOutputStream(s.getOutputStream());
int arr[]={10,20,30,40,50};
for(int i=0;i<=4;i++)
{
dout.writeUTF(""+arr[i]);

}
DataInputStream din= new DataInputStream(s.getInputStream());

String str;
while((str=din.readUTF())!=null)
{ System.out.println("The Sum is:"+str); }

dout.close();
din.close();
s.close();
}
}