package dto;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Signup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
private String FirstNmae;
private String LastNmae;
private String Email;
private String Password;
@Embedded
@ElementCollection(fetch = FetchType.EAGER)
private List<Address> list =new ArrayList();

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public Signup() {
	super();
	// TODO Auto-generated constructor stub
}

public Signup(String firstNmae, String lastNmae, String email, String password, List<dto.Address> list) {
	super();
	FirstNmae = firstNmae;
	LastNmae = lastNmae;
	Email = email;
	Password = password;
	this.list = list;
}
public List<Address> getList() {
	return list;
}
public void setList(List<Address> list) {
	this.list = list;
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
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
@Override
public String toString() {
	return "Signup [id=" + id + ", FirstNmae=" + FirstNmae + ", LastNmae=" + LastNmae + ", Email=" + Email
			+ ", address=" + "]";
}



}
