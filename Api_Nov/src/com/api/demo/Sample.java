package com.api.demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Sample {

	public static void getData() throws JAXBException {
		JAXBContext newI = JAXBContext.newInstance(Employee.class);
		Unmarshaller un = newI.createUnmarshaller();
		File path = new File("E:\\Seleniumnew\\Api_Nov\\Employee.xml");
		Object ob = un.unmarshal(path);

		Employee emp = (Employee) ob;

		int id = emp.getId();
		String name = emp.getName();
		long mobile = emp.getMobile();
		String email = emp.getEmail();
		Address address = emp.getAddress();
		System.out.println("Id " + '"'+id+'"');
		System.out.println("Name " + '"'+name+'"');
		System.out.println("Mobile " + '"'+mobile+'"');
		System.out.println("Email " + '"'+email+'"');
		
		System.out.println("--------zPermanent Address ");
		System.out.println("Street "+'"'+address.getPeraddress().getStreet()+'"');
		System.out.println("District "+'"'+address.getPeraddress().getDistrict()+'"');
		System.out.println("State "+'"'+address.getPeraddress().getState()+'"');
		
		System.out.println("--------Temporary Address ");
		
		System.out.println("Street "+'"'+address.getTempaddress().getStreet()+'"');
		System.out.println("District "+'"'+address.getTempaddress().getDistrict()+'"');
		System.out.println("State "+'"'+address.getTempaddress().getState()+'"');
		
		
	}

	public static void main(String[] args) throws JAXBException {
		getData();
	}

}
