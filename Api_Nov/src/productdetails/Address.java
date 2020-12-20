package productdetails;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Address {

	public static void getData() throws JAXBException {

		JAXBContext jb = JAXBContext.newInstance(ProductDetails.class);
		Unmarshaller un = jb.createUnmarshaller();
		File f = new File("E:\\Seleniumnew\\Api_Nov\\productdetails.xml");
		Object unmarshal = un.unmarshal(f);
		ProductDetails p = (ProductDetails) unmarshal;
		System.out.println("ProductDetails");
		System.out.println(p.getProductName());
		System.out.println(p.getOrderId());
		System.out.println(p.getPrice());
		System.out.println(p.getQty());

		System.out.println("Delivery Address");

		System.out.println(p.getDeliveryAddress().getStreet());
		System.out.println(p.getDeliveryAddress().getCity());
		System.out.println(p.getDeliveryAddress().getDistrict());
		System.out.println(p.getDeliveryAddress().getState());
		
		System.out.println("ContactDetais");
		//System.out.println(p.getDeliveryAddress().getContactDetails().getEmail().getEmailId());
		
		System.out.println("Mobile");
		
		System.out.println(p.getDeliveryAddress().getContactDetails().getMobile().getMobNo());
		System.out.println(p.getDeliveryAddress().getContactDetails().getMobile().getLandLineNo());
	}

	public static void main(String[] args) throws JAXBException {
		getData();
	}

}
