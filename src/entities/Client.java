package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private String email;
	private Date birthDate;

	public Client(String name, String email, Date birthDAte) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birthDAte;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDAte() {
		return birthDate;
	}

	public void setBirthDAte(Date birthDAte) {
		this.birthDate = birthDAte;
	}

	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
	}

}
