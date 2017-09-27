import java.net.*;
import java.io.*;
import java.util.*;

public class Server{

	public static void main(String[] args)throws Throwable{
		Socket soc = new Socket("localhost",3000);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		PrintStream ps = new PrintStream(soc.getOutputStream());
		Scanner s = new Scanner(System.in);
		String input="",output="";

		System.out.println("client activated");
		System.out.println("Enter message. Give 'bye' to quit");
		while(!output.equals("bye")){
			System.out.print("Client message = ");
			output = s.nextLine();
			ps.println(output);
			input = buffer.readLine();
			System.out.println("Server message = "+input);
		
		}
		ps.close();
		buffer.close();
		soc.close();

	}
}
