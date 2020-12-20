 package apiMethods_AP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class GetMethodExample {
	public static void main(String[] args) throws IOException {
		URL url=new URL("http://dummy.restapiexample.com/api/v1/employee/1");
		HttpURLConnection con=(HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.connect();
		
		int responseCode = con.getResponseCode();
		String responseMessage = con.getResponseMessage();
		System.out.println("responseCode "+responseCode);
		System.out.println("responseMessage "+responseMessage);
		
		InputStream inputStream =con.getInputStream();
		InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
		BufferedReader br=new BufferedReader(inputStreamReader);
		String readLine="";
		String line;
		while((line=br.readLine())!=null) {
			readLine=readLine.concat(line);
		}
		System.out.println(readLine);
	}
}
