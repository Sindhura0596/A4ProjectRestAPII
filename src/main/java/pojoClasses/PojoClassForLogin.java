package pojoClasses;

public class PojoClassForLogin {
	
	public String username;
	public String email;
	public String password;
	
	public PojoClassForLogin(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}
