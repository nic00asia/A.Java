import java.io.*; 
import java.net.*; 
import java.util.*; 
public class Client 
{ 
		public static void main(String args[]) throws Exception 
	{ 
		Socket s=new Socket("localhost",777); 
		String str[]={"Hello ","I ","am ","a ","Student ","of ","a ","Government Engineering College ","PATAN "}; 
		DataInputStream din=new DataInputStream(s.getInputStream()); 
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		for(int i=0;i<str.length;i++) 
		{ 
			dout.writeUTF(str[i]);
		} 
			String str1; 
			while((str1=din.readUTF())!=null) 
			{ 
				System.out.println(str1); 
			}
				din.close();
				dout.close(); 
				s.close(); 
	} 
}