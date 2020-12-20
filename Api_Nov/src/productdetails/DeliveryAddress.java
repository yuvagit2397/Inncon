package productdetails;

public class DeliveryAddress {
	private String street;
	private String city;
	private String district;
	private String state;

	private ContactDetails contactDetails;

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetais(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
