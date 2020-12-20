package deSerialization;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

public class deSerialize {
	public static void main(String[] args) {
		//https://reqres.in/api/users/2
		RestAssured.baseURI="https://reqres.in";
		Samp as = RestAssured.given().header("Content-Type","application/json").expect()
		.defaultParser(Parser.JSON).when().get("/api/users/2").as(Samp.class);
		System.out.println(as.getData().getId());
		System.out.println(as.getData().getEmail());
		System.out.println(as.getData().getFirst_name());
		System.out.println(as.getData().getLast_name());
		System.out.println(as.getData().getAvatar());
		
		System.out.println(as.getSupport().getUrl());
		System.out.println(as.getSupport().getText());
	}

}
