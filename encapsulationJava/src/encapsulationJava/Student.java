package encapsulationJava;

public class Student {
	private int rollNumber;	
	private String name;
	private boolean isAttended;	
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Student(int rollNumber) {
		super();
		this.rollNumber = rollNumber;
	}
	
	public void setAttendence(boolean flag) {
		if(!isAttended)
			isAttended = flag;
		System.out.println("Teacher assigned attendence to student");
	}
	
	public boolean getStudentAttendence() {
		System.out.println("Teacher accessed attendence to student");
		return isAttended;
	}
	
}
