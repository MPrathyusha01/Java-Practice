package encapsulationJava;

public class Teacher {
	public static void main(String[] args) {
		Student stu = new Student(101);
		stu.setAttendence(true);
		stu.getStudentAttendence();
	}
}
