import java.net.*;
import java.io.*;
public class DataClient {
 	public static void main(String args[]) {
 		try{Socket s=new Socket("127.0.0.1",1111);
 		BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
 		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(s.getOutputStream());
 		System.out.println("Enter your name to echo...:");
		String str=stdin.readLine();
		out.println(str);
		str=in.readLine();
		System.out.println("Client catched from server:"+str);
		s.close();
 		}catch(Exception e){}
	}
}