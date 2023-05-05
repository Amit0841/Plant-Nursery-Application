package dto;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Embeddable
public class Address {
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int AddId ;
private String houseNo ;
private String city ;
private String state ;
private int pincode ;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String houseNo, String city, String state, int pincode) {
	super();
	this.houseNo = houseNo;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
}
public int getAddId() {
	return AddId;
}
public void setAddId(int addId) {
	AddId = addId;
}
public String getHouseNo() {
	return houseNo;
}
public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
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
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [AddId=" + AddId + ", houseNo=" + houseNo + ", city=" + city + ", state=" + state + ", pincode="
			+ pincode + "]";
}
 
}
