import java.io.*; 
import java.net.*; 
import java.util.*; 
public class Cl 
{ 
 public static void main(String args[]) throws Exception 
 { 
  Socket s=new Socket("localhost",777); 
  DataInputStream din=new DataInputStream(s.getInputStream()); 
  System.out.println(din.readUTF()); 
 }  
} 
 
 