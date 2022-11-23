package inheritanceExample;

public class App {

	public static void main(String[] args) {
		System.out.println("Guest");
		Guest guest = new Guest();
		guest.read();
		
		System.out.println("Dev");
		Developer dev = new Developer();
		dev.read();
		dev.write();
		
		System.out.println("Admin");
		Admin adm = new Admin();
		adm.read();
		adm.write();
		adm.manage();
	}

}
