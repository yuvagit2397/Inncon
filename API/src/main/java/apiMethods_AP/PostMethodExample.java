package apiMethods_AP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PostMethodExample {
public static void main(String[] args) throws IOException {
	URL url=new URL("https://reqres.in/api/users");
	HttpURLConnection con=(HttpURLConnection) url.openConnection();
	con.setRequestMethod("POST");
	con.setDoOutput(true);
	String body="{ \"name\": \"paaanai\",\"job\": \"leader\"}";
	
	byte[] bytes = body.getBytes();
	OutputStream outputStream=con.getOutputStream();
	outputStream.write(bytes);
	
	System.out.println(con.getResponseCode());
	System.out.println(con.getResponseMessage());
}
}
