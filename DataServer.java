import java.net.*;
import java.io.*;
import java.util.*;
public class DataServer{
 	public static void main(String args[]){
 		try{ServerSocket ss=new ServerSocket(1111);
			Socket s=ss.accept();
 			BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
 			PrintStream out=new PrintStream(s.getOutputStream());
 			String str=in.readLine();
			System.out.println("Server Got this...:"+str);
			out.println("Hello "+str);
			s.close();
 			ss.close();
 			}catch(Exception e){}
 		}
 	}