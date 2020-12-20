package com.writetoxml.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

public class Runner {
	
	public static void setData() throws Exception {
		
		JAXBContext newInstance = JAXBContext.newInstance(ProductDetails.class);
		Marshaller createMarshaller = newInstance.createMarshaller();
		File xmlPath = new File("E:\\Seleniumnew\\Api_Nov\\src\\com\\writetoxml\\test\\Product.xml");
		
		ProductDetails productDetails = new ProductDetails();
		List<Product> product = new ArrayList<Product>();
		
		Product p1 = new Product();
		p1.setId(011);
		p1.setName("Moto");
		p1.setPrice(12000);
		p1.setQnt(1);
		p1.setTotal(12000);
		
		Product p2 = new Product();
		p2.setId(51);
		p2.setName("Oppo");
		p2.setPrice(8000);
		p2.setQnt(2);
		p2.setTotal(16000);
		
		product.add(p1);
		product.add(p2);
		
		productDetails.setProduct(product);
		createMarshaller.marshal(productDetails, xmlPath);
		System.out.println("Done");
	}
	
	public static void main(String[] args) throws Exception {
		setData();
	}
}
