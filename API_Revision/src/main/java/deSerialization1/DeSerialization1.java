package deSerialization1;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

public class DeSerialization1 {
  public static void main(String[] args) {
	  //https://reqres.in/api/unknown
	RestAssured.baseURI="https://reqres.in";
	Ds as = RestAssured.given().headers("Content-Type","application/json").
	expect().defaultParser(Parser.JSON).when().get("/api/unknown").as(Ds.class);
	System.out.println(as.getSupport().getUrl());
	System.out.println(as.getSupport().getText());
	System.out.println(as.getPage());
	System.out.println(as.getPer_page());
	System.out.println(as.getTotal());
	System.out.println(as.getTotal_pages());
	List<Data> data = as.getData();
	for (Data data2 : data) {
		System.out.println(data2.getColor());
		System.out.println(data2.getName());
		System.out.println(data2.getPantone_value());
		System.out.println(data2.getId());
		System.out.println(data2.getYear());
		
	}
}
}
