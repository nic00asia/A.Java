import java.io.*; 
import java.net.*; 

class Cliet{
 	public static void main(String[] args) throws Exception {
 		Socket s=new Socket("localhost",8080);
 		//send data to server
 		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
 		//read data 
 		BufferedReader rd=new BufferedReader(new InputStreamReader(s.getInputStream()));
 		//to read data form key word
 		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
 		String str,str1;
 		while(!(str=k.readLine()).equals("exit")){
 			dos.writeBytes(str+"\n");
 			str1=rd.readLine();
 			System.out.println(str1);
 		}
 		k.close();
 		rd.close();
 		dos.close();
 		s.close();
 
 	}
 }