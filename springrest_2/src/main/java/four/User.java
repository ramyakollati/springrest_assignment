package four;

public class User {
	
	String username;
	String password;
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + username + ", password=" + password + "]";
	}
	

}
