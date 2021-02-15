package entities;

import java.util.Date;

public class Client {

	private String name;
	private String email;
	private Date birthDAte;

	public Client(String name, String email, Date birthDAte) {
		super();
		this.name = name;
		this.email = email;
		this.birthDAte = birthDAte;
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
		return birthDAte;
	}

	public void setBirthDAte(Date birthDAte) {
		this.birthDAte = birthDAte;
	}

}
