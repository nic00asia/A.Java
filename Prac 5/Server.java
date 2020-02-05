import java.io.*; 
import java.net.*; 
import java.util.*; 
public class Server 
{ 
	public static void main(String args[]) throws IOException 
	{ 
		ServerSocket ss=new ServerSocket(777); 
		Socket s=ss.accept(); 
		String str,str_out,stro=""; 
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
		while((str=din.readUTF())!=null) 
		{ 
			str_out = str; 
			stro = stro + str_out; 
			dout.writeUTF(stro); 
		}
			din.close();
			dout.close(); 
			ss.close(); 
			s.close(); 
	} 
}