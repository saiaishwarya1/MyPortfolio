package flyAway;

public class Bookbean {

	private String Full_name,address,age,mobile_no,email_id,country;
	

	public Bookbean() {
		super();
	}
	
	public Bookbean(String full_name, String address, String age,String mobile_no, String email_id, String country) {
		super();
		this.Full_name = full_name;
		this.address = address;
		this.age = age;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.country = country;
	}

	public String getFull_name() {
		return Full_name;
	}

	public void setFull_name(String full_name) {
		Full_name = full_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}


	
	
	
}
