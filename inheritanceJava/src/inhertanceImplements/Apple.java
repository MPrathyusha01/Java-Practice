package inhertanceImplements;

public class Apple implements iLaptop {
	@Override
	public void copy() {
		System.out.println("Apple copy");		
	}

	@Override
	public void paste() {
		System.out.println("Apple paste");		
	}

	@Override
	public void cut() {
		System.out.println("Apple cut");		
	}

	@Override
	public void keyboard() {
		System.out.println("Apple keyboard");		
	}
}
