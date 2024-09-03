package pojoClasses;

public class PojoClassForShoppersstack {
	
	public String role;
	public String email;
	public String verifyUrl;
	
	public PojoClassForShoppersstack(String role, String email, String verifyUrl) {
		this.role = role;
		this.email = email;
		this.verifyUrl = verifyUrl;

	}

	public String getRole() {
		return role;
	}

	public String getEmail() {
		return email;
	}
	public String getVerifyUrl() {
		return verifyUrl;
	}
	
}
