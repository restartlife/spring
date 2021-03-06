package spring.ivan.springaop.bean;

public class User {

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", username=" + username + "]";
	}

	private String firstName;

	private String lastName;

	private String username;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
