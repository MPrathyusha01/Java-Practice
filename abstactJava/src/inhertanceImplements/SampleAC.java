package inhertanceImplements;

public abstract class SampleAC implements iLaptop {
	public void copy() {
		System.out.println("Lenovo copy");		
	}

	public void paste() {
		System.out.println("Lenovo paste");		
	}
	
	public void camera() {
		System.out.println("Lenovo Camera");
	}
	
	public abstract void cut();
}
