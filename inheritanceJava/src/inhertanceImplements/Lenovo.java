package inhertanceImplements;

public class Lenovo implements iLaptop {

	@Override
	public void copy() {
		System.out.println("Lenovo copy");		
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste");		
	}

	@Override
	public void cut() {
		System.out.println("Lenovo cut");		
	}

	@Override
	public void keyboard() {
		System.out.println("Lenovo keyboard");		
	}
	
	public void camera() {
		System.out.println("Lenovo Camera");
	}
	
}
