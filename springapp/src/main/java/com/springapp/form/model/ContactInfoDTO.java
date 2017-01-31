package com.springapp.form.model;

public class ContactInfoDTO {

	String name;
	String address;
	String city;
	String state;
	String zip;
	String occupation;
	String gender;
	String phone;
	String email;
	boolean guardian;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isGuardian() {
		return guardian;
	}

	public void setGuardian(boolean guardian) {
		this.guardian = guardian;
	}

	@Override
	public String toString() {
		return "ContactInfoDTO [name=" + name + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", occupation=" + occupation + ", gender=" + gender + ", phone=" + phone + ", email="
				+ email + ", guardian=" + guardian + "]";
	}

	

}
