package dto;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Signup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
private String FirstNmae;
private String LastNmae;
private String Email;
private String Password;
@Embedded
private Address address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Signup() {
	super();
	// TODO Auto-generated constructor stub
}
public Signup(String firstNmae, String lastNmae, String password, String Email,Address address) {
	super();
	this.FirstNmae = firstNmae;
	this.LastNmae = lastNmae;
	this.Password = password;
	this.Email = Email;
	this.address = address;
	
}
public String getFirstNmae() {
	return FirstNmae;
}
public void setFirstNmae(String firstNmae) {
	FirstNmae = firstNmae;
}
public String getLastNmae() {
	return LastNmae;
}
public void setLastNmae(String lastNmae) {
	LastNmae = lastNmae;
}

public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
@Override
public String toString() {
	return "Signup [id=" + id + ", FirstNmae=" + FirstNmae + ", LastNmae=" + LastNmae + ", Email=" + Email
			+ ", address=" + address + "]";
}



}
