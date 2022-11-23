package inhertanceImplements;

public class HP implements iLaptop {
	@Override
	public void copy() {
		System.out.println("HP copy");		
	}

	@Override
	public void paste() {
		System.out.println("HP paste");		
	}

	@Override
	public void cut() {
		System.out.println("HP cut");		
	}

	@Override
	public void keyboard() {
		System.out.println("HP keyboard");		
	}
	
	public void printer() {
		System.out.println("HP printer");
	}
}
