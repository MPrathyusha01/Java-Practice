package inheritanceExample;

public class Admin extends Developer {
	
	public void manage() {
		super.read();
		write();
		System.out.println("Can manage code");
	}
	
	public void read() {
		System.out.println("Admin read");
	}
}
