import java.util.ArrayList;

public class SchoolClass {

	String className;
	int roomNumber;
	String classTeacherFirstName;
	String classTeacherLastName;

	ArrayList<Students> students = new ArrayList<>();
	ArrayList<Teachers> teachers = new ArrayList<>();

	public SchoolClass(String className, int roomNumber, String classTeacherFirstName, String classTeacherLastName) {
		super();
		this.className = className;
		this.roomNumber = roomNumber;
		this.classTeacherFirstName = classTeacherFirstName;
		this.classTeacherLastName = classTeacherLastName;
	}
}
